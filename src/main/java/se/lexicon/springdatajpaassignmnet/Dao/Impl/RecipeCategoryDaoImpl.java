package se.lexicon.springdatajpaassignmnet.Dao.Impl;

import org.springframework.stereotype.Repository;
import se.lexicon.springdatajpaassignmnet.Dao.RecipeCategoryDao;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeCategory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class RecipeCategoryDaoImpl implements RecipeCategoryDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public RecipeCategory create(RecipeCategory recipeCategory) {
       entityManager.persist(recipeCategory);
        return recipeCategory;
    }

    @Override
    public RecipeCategory findById(int id) {
        return entityManager.find(RecipeCategory.class, id);
    }

    @Override
    public List<RecipeCategory> findAll() {
        return entityManager.createQuery("select r from RecipeCategory  r", RecipeCategory.class)
                .getResultList();
    }

    @Override
    public RecipeCategory uppDate(RecipeCategory recipeCategory) {
        return entityManager.merge(recipeCategory);
    }

    @Override
    public RecipeCategory read(RecipeCategory recipeCategory) {
        return entityManager.find(RecipeCategory.class, recipeCategory);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(RecipeCategory.class, id));

    }
}
