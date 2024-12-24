package com.example.SpringSecurityApplication.repository;

import com.example.SpringSecurityApplication.entity.Myuser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<Myuser,Long> {

    Optional<Myuser> findByUsername(String username);
}
