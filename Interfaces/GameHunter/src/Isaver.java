import java.util.List;

public interface Isaver {
    void read();

    List<String> write(List<String> dataString);

    List<String> toList();
}
