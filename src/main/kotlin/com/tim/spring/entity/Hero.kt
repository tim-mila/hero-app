package com.tim.spring.entity

import org.springframework.data.jpa.domain.AbstractAuditable
import java.io.Serializable
import javax.persistence.*

@Entity
data class Hero(
        @Id
        var id: Long,

        @Column(nullable = false)
        var name: String

) : AbstractAuditable<User, Long>()