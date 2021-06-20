package application.persistence.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "branch")
public class Branch {

  @Id
  public String id;

  private String parentId;

  private List<String> relatedId;

  @NonNull
  private String description;

  @NonNull
  private Boolean active;

  private List<String> options;

  @NonNull
  private Boolean answer;


}
