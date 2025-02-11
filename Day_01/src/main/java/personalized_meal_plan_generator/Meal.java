package personalized_meal_plan_generator;

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        mealPlan.displayMealInfo();
    }

    public <U extends MealPlan> boolean validateAndGenerateMealPlan(U mealPlanType) {
        if (mealPlanType != null) {
            System.out.println("Generating personalized meal plan...");
            mealPlanType.displayMealInfo();
            return true;
        }
        return false;
    }
}

