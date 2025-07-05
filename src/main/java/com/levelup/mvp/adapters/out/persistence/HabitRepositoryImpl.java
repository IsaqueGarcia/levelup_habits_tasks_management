package com.levelup.mvp.adapters.out.persistence;

import com.levelup.mvp.adapters.out.persistence.entity.HabitEntity;
import com.levelup.mvp.domain.repository.HabitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository @RequiredArgsConstructor
public class HabitRepositoryImpl implements HabitRepository {

    private final HabitJpaRepository jpaRepository;

    @Override
    public void createHabit(HabitEntity habit) {
        jpaRepository.save(habit);
    }
}
