package com.levelup.mvp.application.usecase;

import com.levelup.mvp.application.usecase.command.HabitCommand;

public interface CreateHabitUseCase {
    void execute(HabitCommand command);
}
