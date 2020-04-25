package food.factory;

import aviary.factory.TypeOfAnimal;
import food.Carrot;
import food.Food;
import food.Meat;

public class FoodFactory {
    public static Food createFood(TypeOfAnimal animal){
        switch (animal){
            case HERBIVORE: return new Carrot();
            case CARNIVOROUS: return new Meat();
            default: return null;
        }
    }
}
