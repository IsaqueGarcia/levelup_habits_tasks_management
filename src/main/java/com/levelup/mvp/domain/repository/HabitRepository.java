package com.levelup.mvp.domain.repository;

import com.levelup.mvp.adapters.out.persistence.entity.HabitEntity;

public interface HabitRepository {
    void createHabit(HabitEntity habit);
}
