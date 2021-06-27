package tr.gov.tcmb.ornkprj.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import org.springframework.util.Assert;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MENSUP")
public class Mensup implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "SIRANO", nullable = false)
  private BigDecimal siraNo;

  @Column(name = "AD_SOYAD")
  private String adSoyad;

  @OneToMany(mappedBy = "embeddedId.mensup", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  @OrderBy("embeddedId.bastar desc")
  private List<Calisma> calismaKayitlari = new ArrayList<>();

  @OneToOne(mappedBy = "mensup", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
  private Kimlik kimlik;

  public Mensup() {}

  public Mensup(BigDecimal siraNo, String adSoyad) {
    this.siraNo = siraNo;
    this.adSoyad = adSoyad;
  }

  public void kimlikEkle(Kimlik kimlik) {

    Assert.notNull(kimlik, "kimlik boş olamaz!");
    
    kimlik.setMensup(this);

  }

}
