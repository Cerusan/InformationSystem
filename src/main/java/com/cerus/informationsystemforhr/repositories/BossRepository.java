package com.cerus.informationsystemforhr.repositories;

import com.cerus.informationsystemforhr.models.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BossRepository extends JpaRepository<Boss, Integer> {
    Optional<Boss> findByName(String name);
}
