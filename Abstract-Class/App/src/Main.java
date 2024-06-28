public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("john");
        dog.eat();
        dog.sleep();

        System.out.println();

        Bird parrot = new Parrot("tom");
        parrot.eat();
        parrot.sleep();
        parrot.fly();

        System.out.println();

        Bird penguin = new Penguin("pen");
        penguin.eat();
        penguin.sleep();
        penguin.fly();

        System.out.println();
    }
}