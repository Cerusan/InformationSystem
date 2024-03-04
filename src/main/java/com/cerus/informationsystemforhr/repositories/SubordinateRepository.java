package com.cerus.informationsystemforhr.repositories;

import com.cerus.informationsystemforhr.models.Boss;
import com.cerus.informationsystemforhr.models.Subordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubordinateRepository extends JpaRepository<Subordinate, Integer> {
    Optional<Subordinate> findByName(String name);

    List<Subordinate> findByBossId(int id);
}
