public class Dog extends Animal {


    public Dog() {
        this(null);
    }

    public Dog(String name) {
        super(name);
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
