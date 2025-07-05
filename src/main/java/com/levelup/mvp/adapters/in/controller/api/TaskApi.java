package com.levelup.mvp.adapters.in.controller.api;

import com.levelup.mvp.adapters.in.dto.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/tasks")
public interface TaskApi {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Void> createTask(@RequestBody TaskDTO task);

    @PatchMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> updateTask(@PathVariable Long id, @RequestBody TaskDTO task);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody ResponseEntity<List<TaskDTO>> findAllTasks();

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody ResponseEntity<TaskDTO> findTaskDetail(@PathVariable Long id);

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> deleteTask(@PathVariable Long id);
}
