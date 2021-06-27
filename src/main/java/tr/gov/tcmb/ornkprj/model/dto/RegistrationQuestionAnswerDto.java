package tr.gov.tcmb.ornkprj.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationQuestionAnswerDto extends BaseDTO {

  private Number registrationId;
  private Number registrationQuestionSectionId;
  private Number registrationQuestionId;
  private Number registrationAnswerId;

}
