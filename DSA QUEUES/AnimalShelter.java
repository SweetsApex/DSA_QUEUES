package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    Queue<Dog> dogs;
    Queue<Cat> cats;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        } else {
            throw new IllegalArgumentException("Unknown animal type");
        }
        System.out.println(animal.getName() + " has been added to the shelter.");
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.getArrivalTime().before(cat.getArrivalTime())) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Dog dequeueDog() {
        if (dogs.isEmpty()) {
            System.out.println("No dogs available for adoption.");
            return null;
        }
        return dogs.poll();
    }

    public Cat dequeueCat() {
        if (cats.isEmpty()) {
            System.out.println("No cats available for adoption.");
            return null;
        }
        return cats.poll();
    }
}
