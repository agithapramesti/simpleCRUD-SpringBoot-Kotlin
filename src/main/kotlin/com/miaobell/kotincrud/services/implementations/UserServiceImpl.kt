package com.miaobell.kotincrud.services.implementations

import com.miaobell.kotincrud.models.User
import com.miaobell.kotincrud.repositories.UserRepository
import com.miaobell.kotincrud.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
data class UserServiceImpl(@Autowired val userRepository: UserRepository) : UserService{

    override fun index(): List<User> {

        return userRepository.findAll();
    }

    override fun show(name: String): User {

        return userRepository.getOne(name);
    }

    override fun save(user: User): User {

        return userRepository.save(user);
    }

    override fun update(user: User, name: String): User {

        var edit = userRepository.getOne(name)
        edit.address = user.address
        edit.age = user.age

        return userRepository.save(edit)
    }

    override fun delete(name: String) {

        var user = userRepository.getOne(name)
        userRepository.delete(user)
    }

}