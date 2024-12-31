package com.electro.repository.authentication;

import com.electro.model.entity.authentication.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>, JpaSpecificationExecutor<RefreshToken> {

    Optional<RefreshToken> findByToken(String token);

}
