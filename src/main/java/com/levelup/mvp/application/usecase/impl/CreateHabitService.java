package com.levelup.mvp.application.usecase.impl;

import com.levelup.mvp.adapters.out.persistence.entity.HabitEntity;
import com.levelup.mvp.adapters.out.persistence.mapper.HabitEntityMapper;
import com.levelup.mvp.application.usecase.CreateHabitUseCase;
import com.levelup.mvp.application.usecase.command.HabitCommand;
import com.levelup.mvp.domain.repository.HabitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class CreateHabitService implements CreateHabitUseCase {

    private final HabitRepository repository;

    @Override
    public void execute(HabitCommand command) {
        HabitEntity habitEntity = HabitEntityMapper.toEntity(command);
        repository.createHabit(habitEntity);
    }
}
