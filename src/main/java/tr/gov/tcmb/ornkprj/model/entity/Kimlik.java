package tr.gov.tcmb.ornkprj.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "KIMLIK")
public class Kimlik implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SIRANO", nullable = false)
  private Mensup mensup;

}
