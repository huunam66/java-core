public class Parrot extends Bird {

    public Parrot() {
        this(null);
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("\nI'm fly not bad !");
    }
}
