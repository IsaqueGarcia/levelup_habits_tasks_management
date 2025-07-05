package com.levelup.mvp.application.usecase.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserCommand {
    private Long id;
    private List<HabitCommand> habits;
    private List<TaskCommand> tasks;
}
