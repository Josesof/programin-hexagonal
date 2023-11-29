package com.company.game.application.usecases;

import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.DeleteTaskUseCase;
import com.company.game.domain.ports.input.RetrieveTaskUseCase;
import com.company.game.domain.ports.output.TaskRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase, RetrieveTaskUseCase {

  private  TaskRepositoryPort taskRepositoyPort;


  @Override
  public boolean deleteTask(Long id) {
    return taskRepositoyPort.deleteById(id);
  }

  @Override
  public Optional<Task> getTasks(Long id) {
    return Optional.empty();
  }

  @Override
  public List<Task> getAllTasks() {
    return null;
  }
}
