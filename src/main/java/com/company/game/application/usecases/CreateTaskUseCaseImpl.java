package com.company.game.application.usecases;

import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.CreateTaskUseCase;
import com.company.game.domain.ports.output.TaskRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

  private  TaskRepositoryPort taskRepositoyPort;

  @Override
  public Task createTasks(Task task) {
    return taskRepositoyPort.save(task);
  }
}
