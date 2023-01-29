package se.lexicon.springdatajpaassignmnet.Dao.Impl;

import org.springframework.stereotype.Repository;
import se.lexicon.springdatajpaassignmnet.Dao.RecipeInstructionDao;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeInstruction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository

public class RecipeInstructionDaoImpl implements RecipeInstructionDao {
    @PersistenceContext
    EntityManager entityManager;

    public RecipeInstructionDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public RecipeInstruction create(RecipeInstruction recipeInstruction) {
        entityManager.persist(recipeInstruction);
        return recipeInstruction;
    }

    @Override
    public RecipeInstruction findById(int id) {
        return entityManager.find(RecipeInstruction.class, id);
    }

    @Override
    public List<RecipeInstruction> findAll() {
        return entityManager.createQuery("select rn from RecipeInstruction rn",RecipeInstruction.class)
                .getResultList();
    }

    @Override
    public RecipeInstruction uppDate(RecipeInstruction recipeInstruction) {
        return entityManager.merge(recipeInstruction);
    }

    @Override
    public RecipeInstruction read(RecipeInstruction recipeInstruction) {
        return entityManager.find(RecipeInstruction.class, recipeInstruction);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(RecipeInstruction.class, id));

    }
}
