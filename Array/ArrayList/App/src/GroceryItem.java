public record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "PRODUCT", 1);
    }

    public GroceryItem(String name, String type) {
        this(name, type, 1);
    }

//    @Override
//    public String toString() {
//        return "GroceryItem{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", count=" + count +
//                '}';
//    }
}
