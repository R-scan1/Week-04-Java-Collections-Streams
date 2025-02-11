package personalized_meal_plan_generator;

public class Main {
    public static void main(String[] args) {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>(vegetarianMeal);
        Meal<VeganMeal> veganMealPlan = new Meal<>(veganMeal);
        Meal<KetoMeal> ketoMealPlan = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>(highProteinMeal);

        vegetarianMealPlan.generateMealPlan();
        veganMealPlan.generateMealPlan();
        ketoMealPlan.generateMealPlan();
        highProteinMealPlan.generateMealPlan();

        Meal<MealPlan> mealPlan = new Meal<>(null); // Null MealPlan to use the method
        mealPlan.validateAndGenerateMealPlan(veganMeal);
    }
}
