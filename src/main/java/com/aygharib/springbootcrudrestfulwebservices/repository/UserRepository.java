package com.aygharib.springbootcrudrestfulwebservices.repository;

import com.aygharib.springbootcrudrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
