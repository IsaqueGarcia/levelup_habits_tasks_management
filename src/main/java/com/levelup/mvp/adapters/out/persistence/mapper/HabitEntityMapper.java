package com.levelup.mvp.adapters.out.persistence.mapper;

import com.levelup.mvp.adapters.out.persistence.entity.HabitEntity;
import com.levelup.mvp.application.usecase.command.HabitCommand;

public class HabitEntityMapper {
    public static HabitEntity toEntity(HabitCommand habit){
        return HabitEntity.builder()
//                .user(habit.getUser())
                .name(habit.getName())
                .description(habit.getDescription())
                .finishedDate(habit.getFinishedDate())
                .status(habit.getStatus())
                .order(habit.getOrder())
                .difficulty(habit.getDifficulty())
                .category(habit.getCategory())
                .frequency(habit.getFrequency())
                .timesPerDay(habit.getTimesPerDay())
                .xp(habit.getXp())
                .coins(habit.getCoins())
                .timesPerWeek(habit.getTimesPerWeek())
                .build();
    }
}
