package tr.gov.tcmb.ornkprj.config;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.stereotype.Component;
import tr.gov.tcmb.ornkprj.model.entity.Calisma;
import tr.gov.tcmb.ornkprj.model.entity.CalismaId;

@Component
public class EntityInterceptor extends EmptyInterceptor {

  private static final long serialVersionUID = 1L;

  private static final Log logger = LogFactory.getLog(EntityInterceptor.class);

  @Override
  public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
      String[] propertyNames, Type[] types) {

    logger.info(id);

    if (entity instanceof Calisma) {
      logger.info(((CalismaId) id).getBastar());
    }

    return true;

  }

}
