public class Eagle extends Animal implements Flyable, Seeable {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle makes a sharp sound.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public void see() {
        System.out.println(getName() + " has excellent vision.");
    }
}