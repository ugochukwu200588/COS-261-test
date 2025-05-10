import java.util.Scanner; // Import Scanner class for user input
public class AtmAccount {
    private double balance; // Private variable to store the account balance

    // Constructor to initialize the account with an initial balance
    public AtmAccount(double initialBalance) {
        this.balance = initialBalance; // Set the initial balance
    }

    // Method to display the current balance
    public void checkBalance() {
        System.out.printf("Your current balance is: ₦%.2f\n", balance); // Display balance with 2 decimal places
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0) { // Check if the deposit amount is valid
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount; // Add the amount to the balance
            System.out.printf("You have deposited ₦%.2f\n", amount); // Confirm deposit
            System.out.printf("Your new balance is: ₦%.2f\n", balance); // Show updated balance
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= 0) { // Check if the withdrawal amount is valid
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) { // Check if there are sufficient funds
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount; // Subtract the amount from the balance
            System.out.printf("You have withdrawn ₦%.2f\n", amount); // Confirm withdrawal
            System.out.printf("Your new balance is: ₦%.2f\n", balance); // Show updated balance
        }
    }

    // Method to display the ATM menu and handle user interactions
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        int choice; // Variable to store user's menu choice

        // Loop to keep displaying the menu until the user chooses to exit
        do {
            System.out.println("ATM Menu:"); // Display menu options
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please select an option: "); // Prompt for user input
            choice = scanner.nextInt(); // Read user's choice

            switch (choice) { // Handle the user's selection
                case 1: // Option to check balance
                    checkBalance(); // Call method to display balance
                    break;
                case 2: // Option to deposit money
                    System.out.print("Enter amount to deposit: "); // Prompt for deposit amount
                    double depositAmount = scanner.nextDouble(); // Read deposit amount
                    deposit(depositAmount); // Call method to process deposit
                    break;
                case 3: // Option to withdraw money
                    System.out.print("Enter amount to withdraw: "); // Prompt for withdrawal amount
                    double withdrawAmount = scanner.nextDouble(); // Read withdrawal amount
                    withdraw(withdrawAmount); // Call method to process withdrawal
                    break;
                case 4: // Option to exit
                    System.out.println("Thank you for using the ATM. Goodbye!"); // Farewell message
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Continue loop until user selects exit (4)
    }

    // Main method to start the ATM simulation
    public static void main(String[] args) {
        AtmAccount account = new AtmAccount(1000.0); // Create account with initial balance of ₦1000
        account.displayMenu(); // Start the ATM menu
    }
}
