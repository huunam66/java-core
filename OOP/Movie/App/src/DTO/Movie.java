package DTO;

public class Movie {
    private String type;
    private String title;

    public Movie() {
        this(null, null);
    }

    public Movie(String type, String title) {
        this.type = type;
        this.title = title;
    }

    public static Movie getMovie(String press, String title) {
        return switch (press.toUpperCase().charAt(0)) {
            case 'C' -> new Comedy("Comedy", title);
            case 'S' -> new Science("Science", title);
            case 'A' -> new Adventure("Adventure", title);
            default -> new Movie("Movie", title);
        };
    }

    public void watchesMovie() {
        System.out.printf("%s is a %s !", title, this.getClass().getSimpleName());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" + "type='" + type + '\'' + ", title='" + title + '\'' + '}';
    }
}
