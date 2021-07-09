package io.github.api.recipeapi.exception;

/*
*
* Recipe Load Exception
*
*/

public class RecipeLoadException extends RuntimeException {
    /**
     * Throw When number in "RecipeData/data.yml" is not Integer
     * <ul>
     *     <li>If you change number in "RecipeData/data.yml"</li>
     * </ul>
     */
    public RecipeLoadException() {
        super();
    }

    public RecipeLoadException(String s) {
        super(s);
    }
}
