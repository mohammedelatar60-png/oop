public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Max", 3);
        Animal eagle = new Eagle("Sky", 5);
        Animal shark = new Shark("Bruce", 7);
        Animal penguin = new Penguin("Pingo", 2);

        Animal[] animals = {
                dog,
                eagle,
                shark,
                penguin
        };

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }

        Flyable flyingAnimal = new Eagle("Sky", 5);
        flyingAnimal.fly();

        Swimmable swimmingAnimal = new Shark("Bruce", 7);
        swimmingAnimal.swim();
    }
}