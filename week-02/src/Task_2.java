import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seconds;

        do {
            System.out.println("Seconds after lightning: ");
            seconds = scanner.nextDouble();
        } while (seconds < 0);

        double distance = seconds * 300;
        System.out.println("Distance: " + distance + " meters.");
    }
}
