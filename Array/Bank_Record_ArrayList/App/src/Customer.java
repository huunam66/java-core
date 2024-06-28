import java.util.ArrayList;

public record Customer(String id, String name, ArrayList<Double> transactions) {
    public Customer(String id, String name) {
        this(id, name, new ArrayList<>());
    }

    @Override
    public String toString() {
        return String.format("\nID: %s\nName: %s", id, name);
    }
}
