package com.levelup.mvp.domain.model;

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
public class BaseModel {

    private Long id;
    private UserModel user;

    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    private String name;
    private String description;
    private LocalDateTime finishedDate;
    private Status status;
    private Integer order;
}
