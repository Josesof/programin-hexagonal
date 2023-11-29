package com.company.game.domain.ports.input;

import com.company.game.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
  Optional<Task> getTasks(Long id);
  List<Task> getAllTasks();
}
