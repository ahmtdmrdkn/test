package tr.gov.tcmb.ornkprj.model.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TarihTestDTO {

  private Date tarih;
  private Date tarih2;

  public TarihTestDTO() {}

  public TarihTestDTO(Date tarih, Date tarih2) {
    this.tarih = tarih;
    this.tarih2 = tarih2;
  }

}
