package com.electro.service.auth;

import com.electro.model.request.authentication.RegistrationRequest;
import com.electro.model.request.authentication.ResetPasswordRequest;
import com.electro.model.request.authentication.UserRequest;

public interface VerificationService {

    Long generateTokenVerify(UserRequest userRequest);

    void resendRegistrationToken(Long userId);

    void confirmRegistration(RegistrationRequest registration);

    void changeRegistrationEmail(Long userId, String emailUpdate);

    void forgetPassword(String email);

    void resetPassword(ResetPasswordRequest resetPasswordRequest);

}
