package tr.gov.tcmb.ornkprj.model.entity.converter;

import java.util.Objects;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import tr.gov.tcmb.ornkprj.model.entity.reference.BasvuruTip;

@Converter
public class TalepBasvuruTipAttributeConverter implements AttributeConverter<BasvuruTip, Integer> {

  @Override
  public Integer convertToDatabaseColumn(BasvuruTip attribute) {

    if (Objects.isNull(attribute)) {
      return null;
    }

    switch (attribute) {
      case TIP_1:
        return 1;
      case TIP_13:
        return 13;
      default:
        throw new IllegalArgumentException(attribute + " not supported.");
    }

  }

  @Override
  public BasvuruTip convertToEntityAttribute(Integer dbData) {

    if (Objects.isNull(dbData)) {
      return null;
    }

    switch (dbData) {
      case 1:
        return BasvuruTip.TIP_1;
      case 13:
        return BasvuruTip.TIP_13;
      default:
        throw new IllegalArgumentException(dbData + " not supported.");
    }

  }

}
