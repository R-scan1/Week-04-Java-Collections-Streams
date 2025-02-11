package personalized_meal_plan_generator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MealPlanGeneratorTest {

    @Test
    public void testVegetarianMealPlan() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        Meal<VegetarianMeal> mealPlan = new Meal<>(vegetarianMeal);

        assertTrue(mealPlan.validateAndGenerateMealPlan(vegetarianMeal), "Vegetarian Meal Plan generation failed");
    }

    @Test
    public void testVeganMealPlan() {
        VeganMeal veganMeal = new VeganMeal();
        Meal<VeganMeal> mealPlan = new Meal<>(veganMeal);

        assertTrue(mealPlan.validateAndGenerateMealPlan(veganMeal), "Vegan Meal Plan generation failed");
    }

    @Test
    public void testKetoMealPlan() {
        KetoMeal ketoMeal = new KetoMeal();
        Meal<KetoMeal> mealPlan = new Meal<>(ketoMeal);

        assertTrue(mealPlan.validateAndGenerateMealPlan(ketoMeal), "Keto Meal Plan generation failed");
    }

    @Test
    public void testHighProteinMealPlan() {
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        Meal<HighProteinMeal> mealPlan = new Meal<>(highProteinMeal);

        assertTrue(mealPlan.validateAndGenerateMealPlan(highProteinMeal), "High-Protein Meal Plan generation failed");
    }

    @Test
    public void testGenerateMultipleMealPlans() {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        List<MealPlan> allMealPlans = List.of(vegetarianMeal, veganMeal, ketoMeal, highProteinMeal);

        for (MealPlan mealPlan : allMealPlans) {
            Meal<MealPlan> mealPlanProcessor = new Meal<>(mealPlan);
            assertTrue(mealPlanProcessor.validateAndGenerateMealPlan(mealPlan),
                    "Meal Plan generation failed for: " + mealPlan.getClass().getSimpleName());
        }
    }
}
