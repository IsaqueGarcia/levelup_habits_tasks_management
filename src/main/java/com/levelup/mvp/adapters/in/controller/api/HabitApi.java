package com.levelup.mvp.adapters.in.controller.api;

import com.levelup.mvp.adapters.in.dto.HabitDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(name = "/habits")
public interface HabitApi {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Void> createHabit(@RequestBody HabitDTO habit);

    @PatchMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> updateHabit(@PathVariable Long id, @RequestBody HabitDTO habit);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody ResponseEntity<List<HabitDTO>> findAllHabits();

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody ResponseEntity<HabitDTO> findHabitDetail(@PathVariable Long id);

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<Void> deleteHabit(@PathVariable Long id);
}
