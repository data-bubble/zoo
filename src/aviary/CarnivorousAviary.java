package aviary;

import animal.Animal;
import animal.CarnivorousAnimal;

public class CarnivorousAviary extends Aviary {

    public CarnivorousAviary(int countOfSeats){
        super(countOfSeats);
    }

    @Override
    public boolean addAnimal(Animal animal) {
        if(animal instanceof CarnivorousAnimal)
        return super.addAnimal(animal);

        System.out.println("не та клетка для животного");
        return false;
    }
}
