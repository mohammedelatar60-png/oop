public class Dog extends Animal implements Swimmable, Seeable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void see() {
        System.out.println(getName() + " can see.");
    }
}