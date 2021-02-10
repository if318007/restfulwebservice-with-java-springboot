package com.springboot.restfulwebservice.repository;
import com.springboot.restfulwebservice.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer>{
}
