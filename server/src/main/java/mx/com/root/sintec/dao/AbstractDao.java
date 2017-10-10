package mx.com.root.sintec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * parent
 * <p>
 * The long description of the file's purpose goes here and describes in detail the complete functionality of the file.
 * This description can span several lines and ends with a period.
 * - Management
 *
 * @author *Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;, https://github.com/bhitOmicron/
 * @version 0.1
 * @summary A short description of the file.
 * @license The Unlicense, http://unlicense.org/
 * @updated 09/10/17
 * @link url goes here
 * @since 1.0.0
 */
public class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    @PersistenceContext
    EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    protected T getByKey(PK key) {
        return (T) entityManager.find(persistentClass, key);
    }

    protected void persist(T entity) {
        entityManager.persist(entity);
    }

    protected void update(T entity) {
        entityManager.merge(entity);
    }

    protected void delete(T entity) {
        entityManager.remove(entity);
    }

}
