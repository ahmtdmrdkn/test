package tr.gov.tcmb.ornkprj.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.gov.tcmb.ornkprj.dao.MensupDAO;
import tr.gov.tcmb.ornkprj.model.dto.MensupDTO;
import tr.gov.tcmb.ornkprj.model.entity.Mensup;

@Service
@Transactional
public class MensupService {

  private @Autowired ModelMapper modelMapper;
  private @Autowired MensupDAO mensupDAO;

  public void ekle(MensupDTO mensupDTO) {

    mensupDAO.persist(modelMapper.map(mensupDTO, Mensup.class));

  }

  public List<MensupDTO> listele() {

    modelMapper.map(mensupDAO.list(), new TypeToken<List<MensupDTO>>() {}.getType());

    return modelMapper.map(mensupDAO.list(), new TypeToken<List<MensupDTO>>() {}.getType());

  }

  public List<MensupDTO> listele2() {

    return modelMapper.map(mensupDAO.list(), new TypeToken<List<MensupDTO>>() {}.getType());

  }

}
