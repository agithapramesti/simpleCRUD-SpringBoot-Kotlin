package com.miaobell.kotincrud.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity // this class is an entity
@Table(name = "tbl_user")
data class User(@Id @Column(name = "user_name") var name: String? = null, //give the default
                @Column(name = "address") var address: String? = null,
                @Column(name = "age") var age: Int? = null)
