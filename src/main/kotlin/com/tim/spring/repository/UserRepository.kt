package com.tim.spring.repository

import com.tim.spring.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String>