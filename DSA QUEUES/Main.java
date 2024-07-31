package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Rex"));
        shelter.enqueue(new Cat("Mittens"));
        shelter.enqueue(new Dog("Spot"));

        System.out.println("\nAdopting any animal:");
        Animal adoptedAnimal = shelter.dequeueAny();
        if (adoptedAnimal != null) {
            System.out.println(adoptedAnimal.getName() + " has been adopted.");
        }

        System.out.println("\nAdopting a dog:");
        Dog adoptedDog = shelter.dequeueDog();
        if (adoptedDog != null) {
            System.out.println(adoptedDog.getName() + " has been adopted.");
        }

        System.out.println("\nAdopting a cat:");
        Cat adoptedCat = shelter.dequeueCat();
        if (adoptedCat != null) {
            System.out.println(adoptedCat.getName() + " has been adopted.");
        }

        System.out.println("\nRemaining animals in the shelter:");
        System.out.println("Dogs: " + shelter.dogs.size());
        System.out.println("Cats: " + shelter.cats.size());
    }
}
