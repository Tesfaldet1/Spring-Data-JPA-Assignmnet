package se.lexicon.springdatajpaassignmnet.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false) // if you do not want to update the id
    private  int id;
    @Column(nullable = false, length = 60)
    private String recipeName;
    @OneToMany(mappedBy = "recipe", orphanRemoval = true)
    private List<RecipeIngredient> recipeIngredientList;
    @OneToOne ( cascade = {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
   @Column(name = "recipeInstruction_id")
    private RecipeInstruction recipeInstruction;

    @ManyToMany
    private Set<RecipeCategory> categories;

    public Recipe() {
    }

    public Recipe(String recipeName) {
        this();
        this.recipeName = recipeName;
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredientList) {
        this.recipeName = recipeName;
        this.recipeIngredientList = recipeIngredientList;
    }

    public Recipe(String recipeName, RecipeInstruction recipeInstruction) {
        this.recipeName = recipeName;
        this.recipeInstruction = recipeInstruction;
    }

    public Recipe(String recipeName, Set<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.categories = categories;
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredientList, RecipeInstruction recipeInstruction, Set<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.recipeIngredientList = recipeIngredientList;
        this.recipeInstruction = recipeInstruction;
        this.categories = categories;
    }

    public Recipe(int id, String recipeName, List<RecipeIngredient> recipeIngredientList, RecipeInstruction recipeInstruction, Set<RecipeCategory> categories) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeIngredientList = recipeIngredientList;
        this.recipeInstruction = recipeInstruction;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredientList() {
        return recipeIngredientList;
    }

    public void setRecipeIngredientList(List<RecipeIngredient> recipeIngredientList) {
        this.recipeIngredientList = recipeIngredientList;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public Set<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<RecipeCategory> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(recipeName, recipe.recipeName)
                && Objects.equals(recipeIngredientList, recipe.recipeIngredientList)
                && Objects.equals(recipeInstruction, recipe.recipeInstruction)
                && Objects.equals(categories, recipe.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeName, recipeIngredientList, recipeInstruction, categories);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredientList=" + recipeIngredientList +
                ", recipeInstruction=" + recipeInstruction +
                ", categories=" + categories +
                '}';
    }
}
