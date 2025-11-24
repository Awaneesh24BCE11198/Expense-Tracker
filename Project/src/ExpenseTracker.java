import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String description;
    double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    static ArrayList<Expense> expenses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- SIMPLE EXPENSE TRACKER ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) addExpense();
            else if (choice == 2) viewExpenses();
            else if (choice == 3) break;
        }
    }

    // Module 1: Add Data
    static void addExpense() {
        System.out.print("Enter Description (e.g. Coffee): ");
        String desc = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amt = scanner.nextDouble();
        expenses.add(new Expense(desc, amt));
        System.out.println("Saved!");
    }

    // Module 2: Process Data
    static void viewExpenses() {
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