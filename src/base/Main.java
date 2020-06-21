package base;

import repository.Zoopark;

public class Main {

    public static void main(String[] args) {
        Zoopark zoopark=Zoopark.getInstance();
        zoopark.work();
    }
}
