package com.levelup.mvp.application.usecase.command;

import com.levelup.mvp.domain.enums.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseCommand {
    private Long id;
    private UserCommand user;
    private String name;
    private String description;
    private LocalDateTime finishedDate;
    private Status status;
    private Integer order;
}
