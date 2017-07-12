package com.tim.spring.repository

import com.tim.spring.entity.Hero
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "hero", collectionResourceRel = "hero")
interface HeroRepository : JpaRepository<Hero, Long> {

    fun findByName(name: String, pageable: Pageable): Page<Hero>
}