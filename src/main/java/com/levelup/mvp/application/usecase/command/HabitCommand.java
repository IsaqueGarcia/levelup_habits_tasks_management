package com.levelup.mvp.application.usecase.command;

import com.levelup.mvp.domain.enums.Category;
import com.levelup.mvp.domain.enums.Days;
import com.levelup.mvp.domain.enums.Difficulty;
import com.levelup.mvp.domain.enums.Frequency;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HabitCommand extends BaseCommand {
    private Difficulty difficulty;
    private Category category;
    private Frequency frequency;
    private Integer timesPerDay;
    private Long xp;
    private Double coins;
    private List<Days> timesPerWeek;
}
