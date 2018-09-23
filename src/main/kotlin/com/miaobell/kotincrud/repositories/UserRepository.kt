package com.miaobell.kotincrud.repositories

import com.miaobell.kotincrud.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String> {
}