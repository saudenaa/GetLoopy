import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRolling;

        do {
            int rollCount = 0;
            continueRolling = true;

            // Print header
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                rollCount++;
                // Generate random values for 3 dice (1-6)
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;

                // Calculate sum of dice
                int sum = die1 + die2 + die3;

                // Print the current roll
                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

                // Check for a triple
                if (die1 == die2 && die2 == die3) {
                    System.out.println("Triple rolled! Ending the game.");
                    break;
                }
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                continueRolling = false;
            }

        } while (continueRolling);

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
