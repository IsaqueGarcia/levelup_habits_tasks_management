package com.levelup.mvp.adapters.out.persistence.entity;

import com.levelup.mvp.domain.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn
    private UserEntity user;

    @Column @CreatedDate private LocalDateTime createDate;
    @Column @LastModifiedDate private LocalDateTime updateDate;

    @Column private String name;
    @Column private String description;
    @Column private LocalDateTime finishedDate;
    @Column private Status status;
    @Column private Integer order;
}
