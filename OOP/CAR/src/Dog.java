public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(String earShape, String tailShape) {
        super();
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, String size, String earShape, String tailShape) {
        super(type, size);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        this(null, null);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("SubClass !");
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" + "earShape='" + earShape + '\'' + ", tailShape='" + tailShape + '\'' + "} " + super.toString();
    }
}
