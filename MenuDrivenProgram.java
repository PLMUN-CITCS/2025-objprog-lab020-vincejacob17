import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

       
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

           
            if (handleMenuChoice(choice)) {
                break;  // Exit the loop if the user chooses to exit
            }
        }

        System.out.println("Exiting program. Goodbye!");
    }


    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    
    public static boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                return false; // Continue the loop
            case 2:
                checkEvenOrOdd();
                return false; // Continue the loop
            case 3:
                return true;  // Exit the loop
            default:
                System.out.println("Invalid choice! Please enter a valid option (1-3).");
                return false; // Continue the loop
        }
    }

    
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

   
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
