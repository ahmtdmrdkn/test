package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationQuestionSectionDto extends BaseDTO {
  
  private String header;
  private List<RegistrationQuestionDto> registrationQuestions = new ArrayList<>();

}
