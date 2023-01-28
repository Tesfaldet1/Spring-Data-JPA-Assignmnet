package se.lexicon.springdatajpaassignmnet.Dao;

import se.lexicon.springdatajpaassignmnet.Entities.Ingredient;

import java.util.List;

public interface IngredientDao {
    Ingredient findById(int id);
    List<Ingredient> findAll();
    Ingredient create(Ingredient ingredient);
    Ingredient uppDate(Ingredient ingredient);
    void delete(int id);
}
