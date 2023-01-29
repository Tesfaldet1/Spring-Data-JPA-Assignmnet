package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;
import se.lexicon.springdatajpaassignmnet.Entities.Recipe;

import java.util.List;

public interface RecipeDao {
    Recipe create(Recipe recipe);
    Recipe findById(int id);
    List<Recipe> findAll();

    Recipe uppDate(Recipe recipe);
    Recipe read(Recipe recipe);
    void delete(int id);
}
