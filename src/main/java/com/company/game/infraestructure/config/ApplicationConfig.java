package com.company.game.infraestructure.config;

import com.company.game.application.services.TaskService;
import com.company.game.application.usecases.*;
import com.company.game.domain.ports.input.GetAdditionalTaskInfoUseCase;
import com.company.game.domain.ports.output.ExternalServicePort;
import com.company.game.domain.ports.output.TaskRepositoryPort;
import com.company.game.infraestructure.adapters.ExternalServiceAdapter;
import com.company.game.infraestructure.repositories.JpaTaskRepositoryAdapter;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@AllArgsConstructor
public class ApplicationConfig {

  @Bean
  public TaskService taskService(TaskRepositoryPort taskRepositoryPort,
                                 GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
    return new TaskService(
      new CreateTaskUseCaseImpl(taskRepositoryPort),
      new RetrieveTaskUseCaseImpl(taskRepositoryPort),
      new UpdateTaskUseCaseImpl(taskRepositoryPort),
      new DeleteTaskUseCaseImpl(taskRepositoryPort),
      getAdditionalTaskInfoUseCase
    );

  }

  @Bean
  public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
    return jpaTaskRepositoryAdapter;
  }

  @Bean
  public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
    return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
  }

  @Bean
  public ExternalServicePort externalServicePort() {
    return new ExternalServiceAdapter();
  }

}
