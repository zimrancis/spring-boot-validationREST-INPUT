package com.ciphersnippet.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciphersnippet.apps.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}