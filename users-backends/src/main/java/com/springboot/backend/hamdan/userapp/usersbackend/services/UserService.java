package com.springboot.backend.hamdan.userapp.usersbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;

import com.springboot.backend.hamdan.userapp.usersbackend.entities.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(@NonNull Long id);

    User save(User user);

    void deleteById(Long id);
}
