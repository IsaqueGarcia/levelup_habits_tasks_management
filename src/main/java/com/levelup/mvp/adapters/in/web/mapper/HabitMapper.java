package com.levelup.mvp.adapters.in.web.mapper;

import com.levelup.mvp.adapters.in.dto.HabitDTO;
import com.levelup.mvp.application.usecase.command.HabitCommand;

public class HabitMapper {
    public static HabitCommand toCommand(HabitDTO habit){
        return HabitCommand.builder()
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
