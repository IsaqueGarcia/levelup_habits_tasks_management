package com.levelup.mvp.adapters.out.persistence;

import com.levelup.mvp.adapters.out.persistence.entity.TaskEntity;
import com.levelup.mvp.domain.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {
}
