package com.example2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example2.Model.User;






@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    User findByUserNameAndPassword(String userName, String password);
}