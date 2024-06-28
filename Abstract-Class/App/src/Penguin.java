public class Penguin extends Bird {

    public Penguin() {
        this(null);
    }

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.print("\nSorry, I'm not very good at that, so i can go swimming not bad !");
    }
}
