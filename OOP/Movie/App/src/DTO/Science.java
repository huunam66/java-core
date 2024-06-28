package DTO;

public class Science extends Movie {

    public Science() {
        this(null, null);
    }

    public Science(String type, String title) {
        super(type, title);
    }

    @Override
    public void watchesMovie() {
        System.out.printf("%s is a %s %s", super.getTitle(), this.getClass().getSimpleName(), this.getClass().getSuperclass().getSimpleName());
        String[] characteristic = new String[]{"Scientific topic", "Accuracy and objectivity", "The presentation style is clear and easy to understand", "Use images and graphics", "Educational", "Entertainment", "Face of expert", "Practical experiments and research", "Explore and discover"};

        System.out.printf("\n.. %s".repeat(characteristic.length), (Object[]) characteristic);
    }

    @Override
    public String toString() {
        return "Science{} " + super.toString();
    }
}
