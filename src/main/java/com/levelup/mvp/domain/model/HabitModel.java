package com.levelup.mvp.domain.model;

import com.levelup.mvp.domain.enums.Category;
import com.levelup.mvp.domain.enums.Days;
import com.levelup.mvp.domain.enums.Difficulty;
import com.levelup.mvp.domain.enums.Frequency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitModel extends BaseModel {
    private Difficulty difficulty;
    private Category category;
    private Frequency frequency;
    private Integer timesPerDay;
    private Long xp;
    private Double coins;
    private List<Days> timesPerWeek;
}
