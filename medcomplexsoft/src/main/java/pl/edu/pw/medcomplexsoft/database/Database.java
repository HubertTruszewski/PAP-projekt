package pl.edu.pw.medcomplexsoft.database;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class Database {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static void initialize()
    {
        if(entityManagerFactory == null) {
        entityManagerFactory = Persistence.createEntityManagerFactory("medcomplexsoft");
        entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Stan entity managera: "+entityManager.isOpen());
        }
    }

    public static void close()
    {
        entityManager.close();
        entityManagerFactory.close();
    }

    public static EntityManager getEntityManager()
    {
        return entityManager;
    }


    // public static <T> List<T> getObjects(Class<T> cls) {
    //     CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    //     CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(cls);
    //     Root<T> tRoot = criteriaQuery.from(cls);
    //     return entityManager.createQuery(criteriaQuery.select(tRoot)).getResultList();
    // }

    // public static <T> List<T> getObjects(Class<T> cls, Predicate predicate) {
    //     CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    //     CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(cls);
    //     Root<T> tRoot = criteriaQuery.from(cls);
    //     criteriaQuery.where(predicate);
    //     return entityManager.createQuery(criteriaQuery).getResultList();
    // }

    // public static <T> void save(T obj) {
    //     EntityTransaction tx =  entityManager.getTransaction();
    //     tx.begin();
    //     entityManager.persist(obj);
    //     tx.commit();
    // }

}
