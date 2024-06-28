public class Bird extends Animal implements ICanFly {

    public Bird() {
        this(null);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("\n%s is flapping its wings !", this.getClass().getSimpleName());
    }

    @Override
    public void eat() {
        System.out.printf("\n%s %s is eating !", this.getClass().getSimpleName(), super.getName());
    }

    @Override
    public void sleep() {
        System.out.printf("\n%s %s is sleeping !", this.getClass().getSimpleName(), super.getName());
    }
}
