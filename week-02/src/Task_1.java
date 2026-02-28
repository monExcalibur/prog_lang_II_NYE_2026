import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("Below freezing");
        } else if (temperature < 30) {
            System.out.println("Average");
        } else {
            System.out.println("Too hot");
        }
    }
}