import DTO.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n\nPress 'A' or 'a' for Adventure Movie" + "\nPress 'C' or 'c' for Comedy Movie" + "\nPress 'S' or 's' for Science Movie" + "\nPress 'Q' or 'q' to quit" + "\nPress: ");
            String press = scanner.nextLine();
            if ("Qq".contains(press)) break;

            System.out.print("\nTitle: ");
            String title = scanner.nextLine();

            Movie movie = Movie.getMovie(press, title);
            movie.watchesMovie();
        }

//        test1 t2 = new test2();
//        t2.show2();
    }
}