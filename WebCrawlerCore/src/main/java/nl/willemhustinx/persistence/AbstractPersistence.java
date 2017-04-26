package nl.willemhustinx.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Arrays;
import java.util.List;

/**
 * Created by willemhustinx on 21-4-2017.
 */

public abstract class AbstractPersistence<T> {

    private final Class<T> clazz;
    @PersistenceContext
    private EntityManager entityManager;

    protected AbstractPersistence(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void persist(T t) {
        entityManager.persist(t);
    }

    public void persist(List<T> t) {
        t.forEach(entity -> entityManager.persist(entity));
    }

    public void persist(T... t) {
        Arrays.stream(t).forEach(entity -> entityManager.persist(entity));
    }

    public boolean contains(T t) {
        return entityManager.contains(t);
    }

    public List<T> getAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(clazz);
        query.select(query.from(clazz));
        return entityManager.createQuery(query).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}