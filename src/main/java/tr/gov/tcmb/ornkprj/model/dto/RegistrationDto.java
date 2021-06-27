package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto extends BaseDTO {

  private String name;
  private List<RegistrationQuestionSectionDto> registrationQuestionSections = new ArrayList<>();
  private List<RegistrationQuestionAnswerDto> registrationAnsweredQuestions = new ArrayList<>();

}
