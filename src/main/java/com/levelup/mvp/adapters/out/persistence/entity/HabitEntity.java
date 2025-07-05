package com.levelup.mvp.adapters.out.persistence.entity;

import com.levelup.mvp.domain.enums.Category;
import com.levelup.mvp.domain.enums.Days;
import com.levelup.mvp.domain.enums.Difficulty;
import com.levelup.mvp.domain.enums.Frequency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_habit")
public class HabitEntity extends BaseEntity {
    @Column private Difficulty difficulty;
    @Column private Category category;
    @Column private Frequency frequency;
    @Column private Integer timesPerDay;
    @Column private Long xp;
    @Column private Double coins;

    @ElementCollection(targetClass = Days.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "habit_days", joinColumns = @JoinColumn(name = "habit_id"))
    @Column(name = "day")
    private List<Days> timesPerWeek;
}