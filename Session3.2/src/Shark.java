public class Shark extends Animal implements Swimmable, Seeable {

    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Shark makes no noticeable sound.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void see() {
        System.out.println(getName() + " can see underwater.");
    }
}