/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.xml.bind.annotation.XmlRegistry;

/**
 *
 * @author Lei
 */
@XmlRegistry
public class ObjectFactory {
    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: generated
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Nutrition }
     *
     */
    public Nutrition createNutrition() {
        return new Nutrition();
    }

    /**
     * Create an instance of {@link Nutrition.Food }
     *
     */
    public Nutrition.Food createNutritionFood() {
        return new Nutrition.Food();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues }
     *
     */
    public Nutrition.DailyValues createNutritionDailyValues() {
        return new Nutrition.DailyValues();
    }

    /**
     * Create an instance of {@link Nutrition.Food.Serving }
     *
     */
    public Nutrition.Food.Serving createNutritionFoodServing() {
        return new Nutrition.Food.Serving();
    }

    /**
     * Create an instance of {@link Nutrition.Food.Calories }
     *
     */
    public Nutrition.Food.Calories createNutritionFoodCalories() {
        return new Nutrition.Food.Calories();
    }

    /**
     * Create an instance of {@link Nutrition.Food.Vitamins }
     *
     */
    public Nutrition.Food.Vitamins createNutritionFoodVitamins() {
        return new Nutrition.Food.Vitamins();
    }

    /**
     * Create an instance of {@link Nutrition.Food.Minerals }
     *
     */
    public Nutrition.Food.Minerals createNutritionFoodMinerals() {
        return new Nutrition.Food.Minerals();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.TotalFat }
     *
     */
    public Nutrition.DailyValues.TotalFat createNutritionDailyValuesTotalFat() {
        return new Nutrition.DailyValues.TotalFat();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.SaturatedFat }
     *
     */
    public Nutrition.DailyValues.SaturatedFat createNutritionDailyValuesSaturatedFat() {
        return new Nutrition.DailyValues.SaturatedFat();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.Cholesterol }
     *
     */
    public Nutrition.DailyValues.Cholesterol createNutritionDailyValuesCholesterol() {
        return new Nutrition.DailyValues.Cholesterol();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.Sodium }
     *
     */
    public Nutrition.DailyValues.Sodium createNutritionDailyValuesSodium() {
        return new Nutrition.DailyValues.Sodium();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.Carb }
     *
     */
    public Nutrition.DailyValues.Carb createNutritionDailyValuesCarb() {
        return new Nutrition.DailyValues.Carb();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.Fiber }
     *
     */
    public Nutrition.DailyValues.Fiber createNutritionDailyValuesFiber() {
        return new Nutrition.DailyValues.Fiber();
    }

    /**
     * Create an instance of {@link Nutrition.DailyValues.Protein }
     *
     */
    public Nutrition.DailyValues.Protein createNutritionDailyValuesProtein() {
        return new Nutrition.DailyValues.Protein();
    }
}
