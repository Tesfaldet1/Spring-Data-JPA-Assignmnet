package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeCategory;

import java.util.List;

public interface RecipeCategoryDao {
    RecipeCategory create(RecipeCategory recipeCategory);
    RecipeCategory findById(int id);
    List<RecipeCategory> findAll();

    RecipeCategory uppDate(RecipeCategory recipeCategory);
    RecipeCategory read(RecipeCategory recipeCategory);
    void delete(int id);
}
