package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class BirimDTO extends BaseDTO {

  private String ad;

  private String birimKod;

  private String gmKod;

  private SeviyeDTO seviye;

  private List<TestDTO> testler = new ArrayList<>();

}
