public abstract class Bird extends Animal {

    public Bird() {
        this(null);
    }

    public Bird(String name) {
        super(name);
    }

    public abstract void fly();


    @Override
    public void eat() {
        System.out.printf("\n%s %s is eating !", this.getClass().getSimpleName(), super.getName());
    }

    @Override
    public void sleep() {
        System.out.printf("\n%s %s is sleeping !", this.getClass().getSimpleName(), super.getName());

    }
}
