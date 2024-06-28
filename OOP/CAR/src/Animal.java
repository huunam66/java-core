public class Animal extends Object {

    private String type;
    private String size;

    public Animal() {
        this(null, null);
    }

    public Animal(String type, String size) {
        this.type = type;
        this.size = size;
    }


    public void show() {
        System.out.println("Parent Class !");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" + "type='" + type + '\'' + ", size='" + size + '\'' + '}';
    }
}
