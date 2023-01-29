package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;

import java.util.List;

public interface IngredientDao {
    Ingredient create(Ingredient ingredient);
    Ingredient findById(int id);
    List<Ingredient> findAll();

    Ingredient uppDate(Ingredient ingredient);
    Ingredient read(Ingredient ingredient);
    void delete(int id);
}
