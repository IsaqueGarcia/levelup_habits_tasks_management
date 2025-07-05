package com.levelup.mvp.adapters.in.controller;

import com.levelup.mvp.adapters.in.controller.api.HabitApi;
import com.levelup.mvp.adapters.in.dto.HabitDTO;
import com.levelup.mvp.adapters.in.web.mapper.HabitMapper;
import com.levelup.mvp.application.usecase.CreateHabitUseCase;
import com.levelup.mvp.application.usecase.command.HabitCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HabitController implements HabitApi {

    private final CreateHabitUseCase createHabitUseCase;

    @Override
    public ResponseEntity<Void> createHabit(HabitDTO habit) {
        HabitCommand habitCommand = HabitMapper.toCommand(habit);
        createHabitUseCase.execute(habitCommand);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateHabit(Long id, HabitDTO habit) {
        return null;
    }

    @Override
    public ResponseEntity<List<HabitDTO>> findAllHabits() {
        return null;
    }

    @Override
    public ResponseEntity<HabitDTO> findHabitDetail(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteHabit(Long id) {
        return null;
    }
}
