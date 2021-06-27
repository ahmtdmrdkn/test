package tr.gov.tcmb.ornkprj.test;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.stream.IntStream;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import tr.gov.tcmb.ornkprj.dao.MensupDAO;
import tr.gov.tcmb.ornkprj.model.dto.MensupDTO;
import tr.gov.tcmb.ornkprj.model.entity.Calisma;
import tr.gov.tcmb.ornkprj.model.entity.CalismaId;
import tr.gov.tcmb.ornkprj.model.entity.Mensup;

public class ServiceTest extends AbstractTestSuite {

  private @Autowired MensupDAO mensupDAO;

  private @Autowired ModelMapper modelMapper;

  @Test
  @Transactional
  @Rollback(value = false)
  public void doTest() {

    Mensup mensup = mensupDAO.get(BigDecimal.valueOf(1L));

    MensupDTO map = modelMapper.map(mensup, MensupDTO.class);

    System.out.println(map);

    // getir(null);

  }

  public void getir(Integer val) {
    Assert.notNull(val, "boş olamaz");
  }

  public void mensupEkle() {
    mensupDAO.persist(new Mensup(BigDecimal.valueOf(1L), "AHMET DEMİRDÖKEN"));
    mensupDAO.persist(new Mensup(BigDecimal.valueOf(2L), "SEÇİL TÜRKKAN"));
  }

  public void calismaKaydiEkle() {

    Mensup mensup = mensupDAO.get(BigDecimal.valueOf(2L));

    Calendar calendar = Calendar.getInstance();

    IntStream.range(0, 4).forEach(i -> {

      calendar.add(Calendar.DAY_OF_YEAR, 1);

      mensup.getCalismaKayitlari().add(new Calisma(new CalismaId(mensup, calendar.getTime()), "TEST SEÇİL"));

    });

  }

}
