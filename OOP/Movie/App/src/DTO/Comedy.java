package DTO;

public class Comedy extends Movie {
    public Comedy() {
        this(null, null);
    }

    public Comedy(String type, String title) {
        super(type, title);
    }

    @Override
    public void watchesMovie() {
        System.out.printf("%s is a %s %s", super.getTitle(), this.getClass().getSimpleName(), this.getClass().getSuperclass().getSimpleName());
        String[] characteristic = new String[]{"Humorous elements", "Funny character", "Funny circumstance", "Funny dialogue", "Exaggeration", "Situational comedy and physical comedy", "Highly entertaining", "Satire and sarcasm", "The plot is simple and easy to understand", "Gentle relationships and conflicts"};

        System.out.printf("\n.. %s".repeat(characteristic.length), (Object[]) characteristic);
    }

    @Override
    public String toString() {
        return "Science{} " + super.toString();
    }
}
