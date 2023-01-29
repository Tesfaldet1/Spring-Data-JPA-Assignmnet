package se.lexicon.springdatajpaassignmnet.Dao.Impl;

import org.springframework.stereotype.Repository;
import se.lexicon.springdatajpaassignmnet.Dao.RecipeIngredientDao;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeIngredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class RecipeIngredientDaoImpl implements RecipeIngredientDao {
    @PersistenceContext
    EntityManager entityManager;

    public RecipeIngredientDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public RecipeIngredient create(RecipeIngredient recipeIngredient) {
        entityManager.persist(recipeIngredient);
        return recipeIngredient;
    }

    @Override
    public RecipeIngredient findById(int id) {
        return entityManager.find(RecipeIngredient.class, id);
    }

    @Override
    public List<RecipeIngredient> findAll() {
        return entityManager.createQuery("select ri from  RecipeIngredient ri", RecipeIngredient.class)
                .getResultList();
    }

    @Override
    public RecipeIngredient uppDate(RecipeIngredient recipeIngredient) {
        return entityManager.merge(recipeIngredient);
    }

    @Override
    public RecipeIngredient read(RecipeIngredient recipeIngredient) {
        return entityManager.find(RecipeIngredient.class, recipeIngredient);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(RecipeIngredient.class, id));

    }
}
