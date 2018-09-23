package com.miaobell.kotincrud.controllers

import com.miaobell.kotincrud.models.User
import com.miaobell.kotincrud.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/user"])
data class UserController(@Autowired val userService: UserService){

    @RequestMapping(
            value = [],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            method = [RequestMethod.GET]
    )
    fun index(): List<User> {

        return userService.index();
    }

    @RequestMapping(
            value = ["/{id}"],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            method = [RequestMethod.GET]
    )
    fun show(@PathVariable("id") name: String): User {

        return userService.show(name);
    }

    @RequestMapping(
            value = [],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            consumes = [MediaType.APPLICATION_JSON_VALUE],
            method = [RequestMethod.POST]
    )
    fun save(@RequestBody user: User): User {

        return userService.save(user);
    }

    @RequestMapping(
            value = ["/{id}"],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            consumes = [MediaType.APPLICATION_JSON_VALUE],
            method = [RequestMethod.PUT]
    )
    fun update(@RequestBody user: User, @PathVariable("id") name: String): User {

        return userService.update(user, name)
    }

    @RequestMapping(
            value = ["/{id}"],
            produces = [MediaType.APPLICATION_JSON_VALUE],
            method = [RequestMethod.DELETE]
    )
    fun delete(@PathVariable("id") name: String): String {

        userService.delete(name)

        return "Deleted!"
    }

}
