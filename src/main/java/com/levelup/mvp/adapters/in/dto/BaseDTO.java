package com.levelup.mvp.adapters.in.dto;

import com.levelup.mvp.domain.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseDTO {
    private Long id;
    private UserDTO user;
    private String name;
    private String description;
    private LocalDateTime finishedDate;
    private Status status;
    private Integer order;
}
