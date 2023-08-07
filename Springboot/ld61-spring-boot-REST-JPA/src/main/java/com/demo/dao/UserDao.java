package com.demo.dao;

import com.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Component
//@Repository, @Service
public interface UserDao extends JpaRepository<User,Integer> {
}
