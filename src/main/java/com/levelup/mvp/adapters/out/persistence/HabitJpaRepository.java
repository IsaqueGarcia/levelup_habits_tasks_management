package com.levelup.mvp.adapters.out.persistence;

import com.levelup.mvp.adapters.out.persistence.entity.HabitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitJpaRepository extends JpaRepository<HabitEntity, Long> {
}
