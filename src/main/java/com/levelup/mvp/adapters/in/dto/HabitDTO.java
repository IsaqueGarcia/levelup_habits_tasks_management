package com.levelup.mvp.adapters.in.dto;

import com.levelup.mvp.domain.enums.Category;
import com.levelup.mvp.domain.enums.Days;
import com.levelup.mvp.domain.enums.Difficulty;
import com.levelup.mvp.domain.enums.Frequency;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HabitDTO extends BaseDTO {
    private Difficulty difficulty;
    private Category category;
    private Frequency frequency;
    private Integer timesPerDay;
    private Long xp;
    private Double coins;
    private List<Days> timesPerWeek;
}
