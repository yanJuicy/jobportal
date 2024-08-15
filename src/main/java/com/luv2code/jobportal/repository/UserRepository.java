package com.luv2code.jobportal.repository;

import com.luv2code.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
