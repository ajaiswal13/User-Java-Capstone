package com.example.userservicecapstone.repositories;

import com.example.userservicecapstone.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token save(Token token);
    Optional<Token> findByTokenValueAndDeletedAndExpiryAtGreaterThan(String tokenValue, boolean deleted, Date expiryAt);
}
