package Calc;

public class Service {
    protected String addition(double n1, double n2) {
        return String.valueOf(n1 + n2);
    }

    protected static String subtraction(double n1, double n2) {
        return String.valueOf(n1 - n2);
    }

    protected String multiplication(double n1, double n2) {
        return String.valueOf(n1 * n2);
    }

    protected String division(double n1, double n2) {
        if (n2 != 0) {
            return String.valueOf(n1 / n2);
        } else return "is not available for calculation. You can't divide by 0";
    }

    protected String getResult(String n1, String n2, String operation) {
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        String result;
        String warning = "is impossible. Unknown mathematical operations"
                + System.lineSeparator() + "Try again with:"
                + System.lineSeparator() + "ADDITION"
                + System.lineSeparator() + "SUBTRACTION"
                + System.lineSeparator() + "MULTIPLICATION"
                + System.lineSeparator() + "DIVISION";

        switch (operation) {
            case "addition":
                result = addition(num1, num2);
                break;
            case "subtraction":
                result = subtraction(num1, num2);
                break;
            case "multiplication":
                result = multiplication(num1, num2);
                break;
            case "division":
                result = division(num1, num2);
                break;
            default:
                result = warning;
        }
        return result;
    }
}
