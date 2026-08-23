public class Penguin extends Animal implements Swimmable, Seeable {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin makes a squawk.");
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