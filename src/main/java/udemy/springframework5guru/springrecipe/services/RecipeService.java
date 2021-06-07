package udemy.springframework5guru.springrecipe.services;

import udemy.springframework5guru.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
