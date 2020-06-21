package repository;

import animal.Animal;
import animal.CarnivorousAnimal;
import animal.HerbivoreAnimal;
import animal.factory.AnimalEnum;
import animal.factory.AnimalFactory;
import aviary.Aviary;
import aviary.CarnivorousAviary;
import aviary.HerbivoreAviary;
import aviary.factory.AviaryFactory;
import aviary.factory.TypeOfAnimal;
import food.Food;
import food.factory.FoodFactory;

import java.util.*;

public class Zoopark {
    public final static int COUNT_OF_ANIMALS=10;
    public final static int COUNT_OF_AVIARY=4;
    public final static int COUNT_OF_SEATS=3;

    private List<Aviary> aviaries;

    private static Zoopark zoopark;

    private Zoopark(){
        aviaries=new ArrayList<>();
    }

    public static Zoopark getInstance(){
        if(zoopark==null){
            zoopark=new Zoopark();
        }

        return zoopark;
    }

    //commit test 1

    public void work() {
        for (int i = 0; i < COUNT_OF_AVIARY; i++) {
            if (i < COUNT_OF_AVIARY / 2)
                aviaries.add(AviaryFactory.createAviary(TypeOfAnimal.CARNIVOROUS, COUNT_OF_SEATS));
            else
                aviaries.add(AviaryFactory.createAviary(TypeOfAnimal.HERBIVORE, COUNT_OF_SEATS));

        }

        for (int i = 0; i < COUNT_OF_ANIMALS; i++) {
            int random = (int) (Math.random() * AnimalEnum.values().length);
            Animal animal = AnimalFactory.createAnimal(AnimalEnum.values()[random]);
            Food food;
            int counter = 0;
            if (animal instanceof CarnivorousAnimal) {
                food = FoodFactory.createFood(TypeOfAnimal.CARNIVOROUS);
                aviaries.stream().filter((x)->x instanceof CarnivorousAviary)
                        .min(Aviary::compareTo).get().addAnimal(animal);
            } else {
                food = FoodFactory.createFood(TypeOfAnimal.HERBIVORE);
                aviaries.stream().filter((x)->x instanceof HerbivoreAviary)
                        .min(Aviary::compareTo).get().addAnimal(animal);
            }

            if (animal != null) {
                animal.eat(food);
            }
            System.out.println(animal.getClass().getSimpleName());

        }
        for(Aviary aviary:aviaries)
            System.out.println(aviary.getClass().getSimpleName()+" "+aviary.size());

    }


}
