package Queues;

import java.util.Date;

public abstract class Animal {
    private final String name;
    private final Date arrivalTime;

    public Animal(String name) {
        this.name = name;
        this.arrivalTime = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return name + " arrived at " + arrivalTime;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
