package com.electro.controller.authentication;

import com.electro.security.JwtUtils;
import com.electro.constant.AppConstants;
import com.electro.model.reponse.authentication.JwtResponse;
import com.electro.model.request.authentication.LoginRequest;
import com.electro.model.request.authentication.RefreshTokenRequest;
import com.electro.model.request.authentication.RegistrationRequest;
import com.electro.model.reponse.authentication.RegistrationResponse;
import com.electro.model.request.authentication.ResetPasswordRequest;
import com.electro.model.request.authentication.UserRequest;
import com.electro.model.reponse.authentication.UserResponse;
import com.electro.model.entity.authentication.RefreshToken;
import com.electro.model.entity.authentication.User;
import com.electro.exception.RefreshTokenException;
import com.electro.mapper.authentication.UserMapper;
import com.electro.repository.authentication.UserRepository;
import com.electro.service.auth.VerificationService;
import com.electro.service.authetication.RefreshTokenService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final VerificationService verificationService;
    private final RefreshTokenService refreshTokenService;
    private final JwtUtils jwtUtils;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public JwtResponse authenticateUser(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        String jwt = jwtUtils.generateJwtToken(authentication);
        String refreshToken = refreshTokenService.createRefreshToken(authentication).getToken();

        return new JwtResponse("Login success!", jwt, refreshToken, Instant.now());
    }

    @PostMapping("/refresh-token")
    @ResponseStatus(HttpStatus.OK)
    public JwtResponse refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest) {
        String refreshToken = refreshTokenRequest.getRefreshToken();

        String jwt = refreshTokenService.findByToken(refreshToken)
                .map(refreshTokenService::verifyExpiration)
                .map(RefreshToken::getUser)
                .map(User::getUsername)
                .map(jwtUtils::generateTokenFromUsername)
                .orElseThrow(() -> new RefreshTokenException("Refresh token was expired. Please make a new signin request!"));

        return new JwtResponse("Refresh token", jwt, refreshToken, Instant.now());
    }

    @PostMapping("/registration")
    public ResponseEntity<RegistrationResponse> registerUser(@RequestBody UserRequest userRequest) {
        Long userId = verificationService.generateTokenVerify(userRequest);
        return ResponseEntity.status(HttpStatus.OK).body(new RegistrationResponse(userId));
    }

    @GetMapping("/registration/{userId}/resend-token")
    public ResponseEntity<ObjectNode> resendRegistrationToken(@PathVariable Long userId) {
        verificationService.resendRegistrationToken(userId);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

    @PostMapping("/registration/confirm")
    public ResponseEntity<ObjectNode> confirmRegistration(@RequestBody RegistrationRequest registration) {
        verificationService.confirmRegistration(registration);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

    @PutMapping("/registration/{userId}/change-email")
    public ResponseEntity<ObjectNode> changeRegistrationEmail(@PathVariable Long userId, @RequestParam String email) {
        verificationService.changeRegistrationEmail(userId, email);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

    @GetMapping("/forgot-password")
    public ResponseEntity<ObjectNode> forgotPassword(@RequestParam String email) {
        verificationService.forgetPassword(email);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

    @PutMapping("/reset-password")
    public ResponseEntity<ObjectNode> resetPassword(@RequestBody ResetPasswordRequest resetPassword) {
        verificationService.resetPassword(resetPassword);
        return ResponseEntity.status(HttpStatus.OK).body(new ObjectNode(JsonNodeFactory.instance));
    }

    @GetMapping("/info")
    public ResponseEntity<UserResponse> getAdminUserInfo(Authentication authentication) {
        String username = authentication.getName();
        UserResponse userResponse = userRepository.findByUsername(username)
                .map(userMapper::entityToResponse)
                .orElseThrow(() -> new UsernameNotFoundException(username));
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

}
