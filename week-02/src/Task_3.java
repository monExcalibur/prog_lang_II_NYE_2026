import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("How old are you? (between 1-20): ");
            age = scanner.nextInt();
        } while (age < 1 || age > 20);

        for (int i = 0; i < age; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < age; i++) {
            System.out.print("| ");
        }
        System.out.println();

        System.out.println("---------");
    }
}
