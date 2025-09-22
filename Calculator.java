import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");
        System.out.println("Type 'x' anytime to exit.\n");

        while (true) {
            // Input first number
            System.out.print("Enter first number: ");
            String input1 = sc.next();
            if (input1.equalsIgnoreCase("x")) {
                System.out.println("Exiting calculator... Goodbye!");
                break;
            }
            double num1 = Double.parseDouble(input1);

            // Input operator
            System.out.print("Enter operator (+, -, *, /): ");
            String opInput = sc.next();
            if (opInput.equalsIgnoreCase("x")) {
                System.out.println("Exiting calculator... Goodbye!");
                break;
            }
            char operator = opInput.charAt(0);

            // Input second number
            System.out.print("Enter second number: ");
            String input2 = sc.next();
            if (input2.equalsIgnoreCase("x")) {
                System.out.println("Exiting calculator... Goodbye!");
                break;
            }
            double num2 = Double.parseDouble(input2);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue; 
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue;
            }
            
            System.out.println("Result: " + result + "\n");
        }

        sc.close();
    }
}
