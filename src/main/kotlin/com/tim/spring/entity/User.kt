package com.tim.spring.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(@Id var id: String = "") : Serializable {
    var email: String = ""
    var name: String = ""
    var link: String = ""
    var picture: String = ""
    var locale: String = ""
}