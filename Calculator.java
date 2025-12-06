public class Calculator {

    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) a / b;
    }
}
