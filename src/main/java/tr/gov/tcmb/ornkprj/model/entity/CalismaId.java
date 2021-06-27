package tr.gov.tcmb.ornkprj.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class CalismaId implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotFound(action = NotFoundAction.IGNORE)
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SIRANO", nullable = false)
  private Mensup mensup;

  @Column(name = "BASTAR", nullable = false)
  @Temporal(TemporalType.DATE)
  private Date bastar;

  public CalismaId() {}

  public CalismaId(Mensup mensup, Date bastar) {
    this.mensup = mensup;
    this.bastar = bastar;
  }

}
