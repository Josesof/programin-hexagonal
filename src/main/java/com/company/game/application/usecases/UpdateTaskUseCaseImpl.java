package com.company.game.application.usecases;


import com.company.game.domain.model.AdditionalTaskInfo;
import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.company.game.domain.ports.input.UpdateTaskUseCase;
import com.company.game.domain.ports.output.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.Optional;


@AllArgsConstructor
public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase, GetAdditionalTaskInfoUseCase {

  private final TaskRepositoryPort taskRepositoyPort;


  @Override
  public Optional<Task> updateTasks(Long id, Task updateTask) {
    return taskRepositoyPort.update(updateTask);
  }

  @Override
  public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
    return null;
  }
}
