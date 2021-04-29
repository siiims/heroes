package com.tour.heroes.repo;

import com.tour.heroes.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {

    List<Hero> getAllByName(String name);
}
