package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;
import se.lexicon.springdatajpaassignmnet.Entities.RecipeInstruction;

import java.util.List;

public interface RecipeInstructionDao {
    RecipeInstruction create(RecipeInstruction recipeInstruction);
    RecipeInstruction findById(int id);
    List<RecipeInstruction> findAll();

    RecipeInstruction uppDate(RecipeInstruction recipeInstruction);
    RecipeInstruction read(RecipeInstruction recipeInstruction);
    void delete(int id);
}
