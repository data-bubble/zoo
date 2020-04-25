package animal.factory;

import animal.*;

import java.security.PublicKey;

public class AnimalFactory {
    public static Animal createAnimal(AnimalEnum animalEnum){
        switch (animalEnum){
            case PANTERA: return new Pantera();
            case LION: return new Lion();
            case DUCK: return new Duck();
            case COW: return new Cow();
            default: return null;
        }
    }
}
