package com.miaobell.kotincrud.services

import com.miaobell.kotincrud.models.User

interface UserService {

    fun index() : List<User>
    fun show(name: String) : User
    fun save(user: User) : User
    fun update(user: User, name: String) : User
    fun delete(name: String)
}