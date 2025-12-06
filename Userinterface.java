import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Calculator calc = new Calculator();

    public void performAddition() {

        System.out.println("\nChoose Addition Type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
            }

            case 2 -> {
                System.out.print("Enter first double: ");
                double a = sc.nextDouble();
                System.out.print("Enter second double: ");
                double b = sc.nextDouble();
                System.out.println("Result: " + calc.add(a, b));
            }

            case 3 -> {
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b = sc.nextInt();
                System.out.print("Enter third integer: ");
                int c = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b, c));
            }

            default -> System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        try {
            double result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> performAddition();
                case 2 -> performSubtraction();
                case 3 -> performMultiplication();
                case 4 -> performDivision();
                case 5 -> {
                    System.out.println("Thank you for using the Calculator!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
