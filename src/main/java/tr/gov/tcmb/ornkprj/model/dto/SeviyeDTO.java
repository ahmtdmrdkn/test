package tr.gov.tcmb.ornkprj.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SeviyeDTO {

  private Integer id;

  private Integer sira;

  public SeviyeDTO() {}

  public SeviyeDTO(Integer id, Integer sira) {
    this.id = id;
    this.sira = sira;
  }

}
