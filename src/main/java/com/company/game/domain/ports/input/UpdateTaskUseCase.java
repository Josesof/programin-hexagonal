package com.company.game.domain.ports.input;

import com.company.game.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
  Optional<Task> updateTasks(Long id,  Task updateTask);
}
