package com.company.game.infraestructure.entities;

import com.company.game.domain.model.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private LocalDateTime creationDate;
  private boolean completed;

  //creamos un metodo estatico donde le demos
  // a los parametros del constructor los valores de los get de la clase task del
  //esto puede ser sustituido por un mapper pero como es una ejemplo tan censillo lo hago en la clase

  public static TaskEntity fromDomainModel(Task tas) {
   return new TaskEntity(tas.getId(), tas.getTitle(),
              tas.getDescription(), tas.getCreationDate(), tas.isCompleted());
  }

  public Task toDomainModel() {
    return new Task(id, title, description, creationDate, completed);
  }


}
