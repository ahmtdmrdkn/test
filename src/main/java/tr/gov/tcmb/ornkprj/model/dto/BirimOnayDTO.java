package tr.gov.tcmb.ornkprj.model.dto;

import lombok.Getter;
import lombok.Setter;
import tr.gov.tcmb.ornkprj.model.entity.reference.BirimOnayDurum;

@Getter
@Setter
public class BirimOnayDTO {

  private String birimAd;
  private BirimDTO bagliBirim;
  private SeviyeDTO seviye;
  private BirimOnayDurum durum = BirimOnayDurum.ONAY_BEKLIYOR;

}
