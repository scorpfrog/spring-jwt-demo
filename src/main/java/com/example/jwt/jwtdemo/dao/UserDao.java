package com.example.jwt.jwtdemo.dao;

import com.example.jwt.jwtdemo.model.DAOUser;
import com.example.jwt.jwtdemo.model.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Long> {

    DAOUser findByUsername(String username);
}
