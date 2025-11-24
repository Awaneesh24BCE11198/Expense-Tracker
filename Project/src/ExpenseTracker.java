import java.util.ArrayList;
import java.util.Scanner;

//Create an expense class having variables and a setter method
class Expense {
    String description;
    double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
}

//Create the public class
public class ExpenseTracker {
    static ArrayList<Expense> expenses = new ArrayList<>(); // initialize an array to take data for lists
    static Scanner scanner = new Scanner(System.in); // use scanner for input

    public static void main(String[] args) {
        while (true) {                                  // Run a while loop to print the possible options
            System.out.println("\n--- SIMPLE EXPENSE TRACKER ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Take input from user

            // Perform various tasks based on the input

            if (choice == 1) addItems(); 
            else if (choice == 2) view();
            else if (choice == 3) break;
        }
    }

    // Choice 1 : Add Expenses
    static void addItems() {
        System.out.print("Enter Description (e.g. Coffee): ");
        String desc = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amt = scanner.nextDouble();
        expenses.add(new Expense(desc, amt));
        System.out.println("Saved!");
    }

    // Choice 2: Show expenses
    static void view() {
        double total = 0;
        System.out.println("\n--- YOUR LIST ---");
        for (Expense e : expenses) {
            System.out.println(e.description + ": " + e.amount);
            total += e.amount;
        }
        System.out.println("-----------------");
        System.out.println("TOTAL SPENT: " + total);
    }
}
