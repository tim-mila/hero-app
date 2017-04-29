package com.tim.spring.repository;

import com.tim.spring.entity.Hero;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hero", path = "hero")
public interface HeroRepository extends JpaRepository<Hero, Long> {

    Page<Hero> findHeroByName(@Param("name") String name, Pageable pageable);
}
