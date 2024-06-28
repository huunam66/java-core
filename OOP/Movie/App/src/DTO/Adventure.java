package DTO;

public class Adventure extends Movie {
    public Adventure() {
        this(null, null);
    }

    public Adventure(String type, String title) {
        super(type, title);
    }

    @Override
    public void watchesMovie() {
        System.out.printf("%s is a %s %s", super.getTitle(), this.getClass().getSimpleName(), this.getClass().getSuperclass().getSimpleName());
        String[] characteristic = new String[]{"Journey and discovery", "The context is diverse and attractive", "The main character is brave and determined", "Dangerous and dramatic situation", "Elements of wonder and mystery", "Character development", "Relationships and teammates", "Message of courage and determination", "The plot is fast and the action is continuous", "Impressive images and sound"};

        System.out.printf("\n.. %s".repeat(characteristic.length), (Object[]) characteristic);
    }

    @Override
    public String toString() {
        return "Science{} " + super.toString();
    }
}
