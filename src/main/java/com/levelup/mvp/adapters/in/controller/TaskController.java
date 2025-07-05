package com.levelup.mvp.adapters.in.controller;

import com.levelup.mvp.adapters.in.controller.api.TaskApi;
import com.levelup.mvp.adapters.in.dto.TaskDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController implements TaskApi {
    @Override
    public ResponseEntity<Void> createTask(TaskDTO task) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateTask(Long id, TaskDTO task) {
        return null;
    }

    @Override
    public ResponseEntity<List<TaskDTO>> findAllTasks() {
        return null;
    }

    @Override
    public ResponseEntity<TaskDTO> findTaskDetail(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteTask(Long id) {
        return null;
    }
}
