package com.springboot.backend.hamdan.userapp.usersbackend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.hamdan.userapp.usersbackend.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
