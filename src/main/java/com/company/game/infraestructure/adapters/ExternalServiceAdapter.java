package com.company.game.infraestructure.adapters;

import com.company.game.domain.model.AdditionalTaskInfo;
import com.company.game.domain.ports.output.ExternalServicePort;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalServiceAdapter implements ExternalServicePort {

  private  RestTemplate restTemplate;
  @Override
  public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
    String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + taskId;
    ResponseEntity<UsoExternalJsonPlaceHolderTodo> response =
                             restTemplate.getForEntity(apiUrl, UsoExternalJsonPlaceHolderTodo.class);
    UsoExternalJsonPlaceHolderTodo todo = response.getBody();
    if(todo == null){
      return  null;
    }
     apiUrl = "https://jsonplaceholder.typicode.com/todos/" + taskId;
    ResponseEntity<JsonPlaceHolderUser> userResponse = restTemplate.getForEntity(apiUrl, JsonPlaceHolderUser.class);
    JsonPlaceHolderUser user = userResponse.getBody();
    if(user == null){
      return  null;
    }
    return new AdditionalTaskInfo(user.getId(), user.getName(), user.getEmail());
  }
}
