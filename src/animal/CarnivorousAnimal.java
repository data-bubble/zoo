package animal;

import food.AnimalFood;
import food.Food;

public abstract class CarnivorousAnimal extends Animal {
    @Override
    public boolean eat(Food food) {
        if(food instanceof AnimalFood)
            return true;
        System.out.println("wrong food");
        return false;
    }
}
