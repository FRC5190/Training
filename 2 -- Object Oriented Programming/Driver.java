import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Robot robot = new GreenHope();
        String input;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a character: ");
            input = scanner.nextLine();
            if (input.toUpperCase().equals("T")) {
                robot.teleop();
            } else if (input.toUpperCase().equals("A")) {
                robot.autonomous();
            } else if (!input.toUpperCase().equals("X")) {
                System.out.println("Invalid input");
            }
            System.out.println();
        } while (!input.toUpperCase().equals("X"));
    }
}
