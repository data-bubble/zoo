package animal;

import food.AnimalFood;
import food.Food;
import food.PlantFood;

public class HerbivoreAnimal extends Animal{

    @Override
    public boolean eat(Food food) {
        if(food instanceof PlantFood)
            return true;
        System.out.println("wrong food");
        return false;
    }
}
