package com.company.game.application.usecases;

import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.DeleteTaskUseCase;
import com.company.game.domain.ports.input.RetrieveTaskUseCase;
import com.company.game.domain.ports.output.TaskRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase, DeleteTaskUseCase {

  private  TaskRepositoryPort taskRepositoyPort;


  @Override
  public Optional<Task> getTasks(Long id) {
    return taskRepositoyPort.findById(id);
  }

  @Override
  public List<Task> getAllTasks() {
    return taskRepositoyPort.findAll();
  }

  @Override
  public boolean deleteTask(Long id) {
    return false;
  }
}
