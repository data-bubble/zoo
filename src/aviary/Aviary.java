package aviary;

import animal.Animal;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public abstract class Aviary implements Comparable<Aviary> {
    private int countOfSeats;
    private List<Animal> animals;

    public Aviary(int countOfSeats){
        this.countOfSeats=countOfSeats;
        animals=new LinkedList<>();
    }

    public boolean addAnimal(Animal animal){
        if(animals.size()==countOfSeats) {
            System.err.println("вальер переполнен");
            return false;
        }
        else return animals.add(animal);

    }
    public int size(){
        return animals.size();
    }
    public boolean remove(Animal animal){
        if(!animals.contains(animal))
            System.err.println("нет такого животного в вальере");
                    return animals.remove(animal);
    }
    public Animal getAnimal(Animal animal){
        for(Animal anl:animals){
            if(anl.getClass().getSimpleName().equals(animal.getClass().getSimpleName()))
                return anl;
        }
        System.err.println("животного нет в клетке");
        return null;
    }

    @Override
    public int compareTo(Aviary o) {
        if(this.size()==o.size())
            return 0;
        if(this.size()<o.size())
            return -1;
        else
            return 1;

    }

//    @Override
//    public int compare(Aviary o1, Aviary o2) {
//        return o1.size()-o2.size();
//    }
}
