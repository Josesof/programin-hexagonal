package com.company.game.application.services;

import com.company.game.domain.model.AdditionalTaskInfo;
import com.company.game.domain.model.Task;
import com.company.game.domain.ports.input.*;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class TaskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase,
                         GetAdditionalTaskInfoUseCase{

  private  CreateTaskUseCase createTaskUseCase;
  private  DeleteTaskUseCase deleteTaskUseCase;
  private  GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;
  private  RetrieveTaskUseCase retrieveTaskUseCase;
  private  UpdateTaskUseCase updateTaskUseCase;

  public TaskService(CreateTaskUseCase createTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase) {
    this.createTaskUseCase = createTaskUseCase;
    this.deleteTaskUseCase = deleteTaskUseCase;
    this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    this.retrieveTaskUseCase = retrieveTaskUseCase;
    this.updateTaskUseCase = updateTaskUseCase;
  }

  @Override
  public Task createTasks(Task task) {

    return createTaskUseCase.createTasks(task);
  }

  @Override
  public boolean deleteTask(Long id) {
    return deleteTaskUseCase.deleteTask(id);
  }

  @Override
  public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {

    return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
  }

  @Override
  public Optional<Task> getTasks(Long id) {

    return retrieveTaskUseCase.getTasks(id);
  }

  @Override
  public List<Task> getAllTasks() {

    return retrieveTaskUseCase.getAllTasks();
  }

  @Override
  public Optional<Task> updateTasks(Long id, Task updateTask) {

    return updateTaskUseCase.updateTasks(id, updateTask);
  }
}
