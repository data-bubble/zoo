package aviary.factory;

import aviary.Aviary;
import aviary.CarnivorousAviary;
import aviary.HerbivoreAviary;

import javax.swing.plaf.IconUIResource;

public class AviaryFactory {

    public static Aviary createAviary(TypeOfAnimal animal,int countOfSeats){
        switch (animal){
            case CARNIVOROUS: return new CarnivorousAviary(countOfSeats);
            case HERBIVORE: return new HerbivoreAviary(countOfSeats);
            default:return null;
        }
    }
}
