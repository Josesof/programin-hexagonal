package com.company.game.application.usecases;


import com.company.game.domain.model.AdditionalTaskInfo;
import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.company.game.domain.ports.output.ExternalServicePort;

import java.util.Optional;


public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

  private final ExternalServicePort externalServicePort;

  public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
    this.externalServicePort = externalServicePort;
  }


  @Override
  public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
    return externalServicePort.getAdditionalTaskInfo(id);
  }

  @Override
  public Optional<Task> updateTasks(Long id, Task updateTask) {
    return Optional.empty();
  }
}
