package tr.gov.tcmb.ornkprj.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.LockModeType;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public abstract class GenericDAO<E, ID extends Serializable> {

  @Autowired
  private SessionFactory sessionFactory;

  protected Class<? extends E> daoType;

  /**
   * By defining this class as abstract, we prevent Spring from creating instance of this class If not
   * defined as abstract, getClass().getGenericSuperClass() would return Object. There would be
   * exception because Object class does not java constructor with parameters.
   */
  public GenericDAO() {
    Type t = getClass().getGenericSuperclass();
    ParameterizedType pt = (ParameterizedType) t;
    daoType = (Class<? extends E>) pt.getActualTypeArguments()[0];
  }

  public Session getCurrentSession() {
    return sessionFactory.getCurrentSession();
  }

  public E get(Number id) {
    return getCurrentSession().get(daoType, id);
  }

  public E get(Number id, LockMode lockMode) {
    return getCurrentSession().get(daoType, id, lockMode);
  }

  public List<E> list() {
    return getCurrentSession().createQuery("from " + daoType.getName()).getResultList();
  }

  public List<E> list(LockModeType lockMode) {
    return getCurrentSession().createQuery("from " + daoType.getName()).setLockMode(lockMode).getResultList();
  }

  public E load(ID id) {
    return getCurrentSession().load(daoType, id);
  }

  public void persist(E entity) {
    getCurrentSession().persist(entity);
  }

  public Long save(E entity) {
    return (Long) getCurrentSession().save(entity);
  }

  public void update(E entity) {
    getCurrentSession().update(entity);
  }

  public void delete(E entity) {
    getCurrentSession().delete(entity);
  }

  public void evict(E entity) {
    getCurrentSession().evict(entity);
  }

}
