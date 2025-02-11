package personalized_meal_plan_generator;

class VeganMeal implements MealPlan {
    @Override
    public void displayMealInfo() {
        System.out.println("Vegan Meal: Excludes all animal products.");
    }
}

