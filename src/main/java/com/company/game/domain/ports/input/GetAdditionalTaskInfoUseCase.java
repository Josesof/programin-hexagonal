package com.company.game.domain.ports.input;

import com.company.game.domain.model.AdditionalTaskInfo;
import com.company.game.domain.model.Task;

import java.util.Optional;

public interface GetAdditionalTaskInfoUseCase extends UpdateTaskUseCase {

  AdditionalTaskInfo getAdditionalTaskInfo(Long id);

  @Override
  Optional<Task> updateTasks(Long id, Task updateTask);
}
