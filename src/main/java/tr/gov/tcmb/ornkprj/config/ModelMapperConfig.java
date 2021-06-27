package tr.gov.tcmb.ornkprj.config;

import org.hibernate.collection.spi.PersistentCollection;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.tcmb.ornkprj.model.dto.MensupDTO;
import tr.gov.tcmb.ornkprj.model.entity.Mensup;

@Configuration
public class ModelMapperConfig {

  PropertyMap<Mensup, MensupDTO> mensupMap = new PropertyMap<Mensup, MensupDTO>() {

    @Override
    protected void configure() {
      skip(destination.getSiraNo());
    }

  };

  @Bean
  public ModelMapper modelMapper() {
    
    ModelMapper modelMapper = new ModelMapper();

    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

    modelMapper.getConfiguration().setPropertyCondition(context -> !(context.getSource() instanceof PersistentCollection));

    modelMapper.addMappings(mensupMap);

    modelMapper.validate();

    return modelMapper;

  }

}
