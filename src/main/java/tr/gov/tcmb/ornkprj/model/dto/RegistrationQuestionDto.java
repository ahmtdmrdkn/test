package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationQuestionDto extends BaseDTO {
  
  private String question;
  private List<RegistrationAnswerDto> registrationAnswers = new ArrayList<>();

}
