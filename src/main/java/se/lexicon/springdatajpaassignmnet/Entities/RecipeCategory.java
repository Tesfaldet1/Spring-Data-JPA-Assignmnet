package se.lexicon.springdatajpaassignmnet.Entities;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;
@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false) // if you do not want to update the id
    private int id;
    @Column(nullable = false, length = 80)
    private String category;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipeSet;

    public RecipeCategory() {
    }

    public RecipeCategory(String category) {
        this();
        this.category = category;
    }

    public RecipeCategory(String category, Set<Recipe> recipeSet) {
        this.category = category;
        this.recipeSet = recipeSet;
    }

    public RecipeCategory(int id, String category, Set<Recipe> recipeSet) {
        this.id = id;
        this.category = category;
        this.recipeSet = recipeSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Recipe> getRecipeSet() {
        return recipeSet;
    }

    public void setRecipeSet(Set<Recipe> recipeSet) {
        this.recipeSet = recipeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return id == that.id && Objects.equals(category, that.category)
                && Objects.equals(recipeSet, that.recipeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, recipeSet);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", recipeSet=" + recipeSet +
                '}';
    }
}
