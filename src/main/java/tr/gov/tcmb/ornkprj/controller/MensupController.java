package tr.gov.tcmb.ornkprj.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonView;
import tr.gov.tcmb.ornkprj.config.View;
import tr.gov.tcmb.ornkprj.model.dto.MensupDTO;
import tr.gov.tcmb.ornkprj.service.MensupService;

@RestController
@RequestMapping("/mensup")
public class MensupController {

  private @Autowired MensupService mensupService;

  @JsonView(View.Public.class)
  @GetMapping
  public List<MensupDTO> listele() {

    return mensupService.listele();

  }

  @PostMapping("/ekle")
  public void ekle(@RequestBody MensupDTO mensupDTO) {

    mensupService.ekle(mensupDTO);

  }

}
