package com.banatech.gn.ambaguimoscou.repository;

import com.banatech.gn.ambaguimoscou.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername();
    Optional<User> findByEmail();
}
