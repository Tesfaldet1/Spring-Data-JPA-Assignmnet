package se.lexicon.springdatajpaassignmnet.Dao.Impl;

import org.springframework.stereotype.Repository;
import se.lexicon.springdatajpaassignmnet.Dao.RecipeDao;
import se.lexicon.springdatajpaassignmnet.Entities.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class RecipeDaoImpl implements RecipeDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Recipe create(Recipe recipe) {
        entityManager.persist(recipe);
        return  recipe;
    }

    @Override
    public Recipe findById(int id) {
        return entityManager.find(Recipe.class, id);
    }

    @Override
    public List<Recipe> findAll() {
        return entityManager.createQuery("select  re from Recipe  re", Recipe.class)
                .getResultList();
    }

    @Override
    public Recipe uppDate(Recipe recipe) {
        return entityManager.merge(recipe);
    }

    @Override
    public Recipe read(Recipe recipe) {
        return entityManager.find(Recipe.class, recipe);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(Recipe.class, id));

    }
}
