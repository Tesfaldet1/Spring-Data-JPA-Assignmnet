package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeCategory;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeIngredient;

import java.util.List;

public interface RecipeIngredientDao {
    RecipeIngredient create(RecipeIngredient recipeIngredient);
    RecipeIngredient findById(int id);
    List<RecipeIngredient> findAll();

    RecipeIngredient uppDate(RecipeIngredient recipeIngredient);
    RecipeIngredient read(RecipeIngredient recipeIngredient);
    void delete(int id);
}
