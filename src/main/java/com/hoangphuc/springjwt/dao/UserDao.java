package com.hoangphuc.springjwt.dao;

import com.hoangphuc.springjwt.model.DAOUser;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}