package tr.gov.tcmb.ornkprj.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CALISMA")
public class Calisma implements Serializable {

  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private CalismaId embeddedId;

  @Column(name = "ACIKLAMA")
  private String aciklama;

  public Calisma() {}

  public Calisma(CalismaId embeddedId, String aciklama) {
    this.embeddedId = embeddedId;
    this.aciklama = aciklama;
  }

}
