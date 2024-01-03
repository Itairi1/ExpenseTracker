import java.util.Scanner;

public class Authenticate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while (true) {
            try {
                System.out.println("Input number between 1 and 3:");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Hello");
                        break;
                    case 2:
                        // Action for choice 2
                        break;
                    case 3:
                        // Action for choice 3
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                        continue; // Restart the loop if choice is invalid
                }
                break; // Break the loop when a valid choice is made
            } catch (Exception e) {
                System.out.println("Wrong value. Please enter a valid number.");
                sc.next(); // Clear the invalid input from the scanner
            }
        }

        sc.close();
    }
}
