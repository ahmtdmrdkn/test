package tr.gov.tcmb.ornkprj.model.dto;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import tr.gov.tcmb.ornkprj.config.View;

@Data
public class MensupDTO {

  @JsonView(View.Public.class)
  private BigDecimal siraNo;

  @JsonView(View.Internal.class)
  private String adSoyad;

  private KimlikDTO kimlik;

}
