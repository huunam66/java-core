import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.describeCar();

        Dog d = new Dog();
        d.show();

        int age = LocalDateTime.now().getYear() - Integer.parseInt("06/06/2002".substring(6));
        System.out.println("Your age is " + age);
        System.out.printf("Your age is %d\n", age);
        System.out.println("Your age is %d".formatted(age));
    }
}