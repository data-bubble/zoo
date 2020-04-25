package aviary;

import animal.Animal;
import animal.CarnivorousAnimal;
import animal.HerbivoreAnimal;

public class HerbivoreAviary extends Aviary {

    public HerbivoreAviary(int countOfSeats){
        super(countOfSeats);
    }

    @Override
    public boolean addAnimal(Animal animal) {
        if(animal instanceof HerbivoreAnimal)
            return super.addAnimal(animal);

        System.out.println("не та клетка для животного");
        return false;
    }
}
