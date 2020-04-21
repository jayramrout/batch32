package jrout.tutorial.springbootdatajpa.repository;

import jrout.tutorial.springbootdatajpa.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor , Integer> {

    List<Actor> findByFirstName(String name);
}
