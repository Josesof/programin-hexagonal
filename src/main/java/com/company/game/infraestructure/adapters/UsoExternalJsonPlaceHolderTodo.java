package com.company.game.infraestructure.adapters;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsoExternalJsonPlaceHolderTodo {
  private Long id;
  private Long userId;

}
