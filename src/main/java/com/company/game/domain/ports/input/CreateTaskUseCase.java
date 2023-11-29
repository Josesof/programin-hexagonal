package com.company.game.domain.ports.input;

import com.company.game.domain.model.Task;

public interface CreateTaskUseCase {
  Task createTasks(Task task);
}
