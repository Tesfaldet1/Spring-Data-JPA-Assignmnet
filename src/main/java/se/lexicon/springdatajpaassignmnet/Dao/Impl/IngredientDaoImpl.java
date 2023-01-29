package se.lexicon.springdatajpaassignmnet.Dao.Impl;

import org.springframework.stereotype.Repository;
import se.lexicon.springdatajpaassignmnet.Dao.IngredientDao;
import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class IngredientDaoImpl implements IngredientDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Ingredient findById(int id) {
        return entityManager.find(Ingredient.class, id);
    }


    @Override
    public List<Ingredient> findAll() {
        return entityManager.createQuery("select i from Ingredient i , Ingredient.class")
                .getResultList();
    }

    @Override
    public Ingredient create(Ingredient ingredient) {
         entityManager.persist(ingredient);
         return  ingredient;
    }

    @Override
    public Ingredient uppDate(Ingredient ingredient) {
        return entityManager.merge(ingredient);
    }

    @Override
    public Ingredient read(Ingredient ingredient) {
        return entityManager.createQuery("select i from Ingredient i",Ingredient.class)
                .getSingleResult();

    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(Ingredient.class, id));

    }
}
