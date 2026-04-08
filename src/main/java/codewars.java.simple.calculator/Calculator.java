package codewars.java.simple.calculator;


public class Calculator {
    public static double calculate(double a, double b, String op) {

        double result = 0;
        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
          default -> {
            throw new IllegalArgumentException();
          }
        }


        return result;
    }
}