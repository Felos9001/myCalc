import java.util.Scanner;

import static java.lang.System.*;

public class Program {

    public static double sum = 0;

    public static void main(String[] args) {
        Program.initialCalculate();

    }


    static void initialCalculate() {
        Scanner input = new Scanner(System.in);

        out.println("Enter Your number (1)");
        double num1 = input.nextDouble();

        calculatePart2(input, num1);
    }

    static double calculatePart2(Scanner input, double num1) {
        String operator;
        out.println("What operator do you want to use(+, -, *, /, ^, |)");
        operator = input.next();

        out.println("Enter Your number (2)");
        double num2 = input.nextDouble();

        switch (operator) {
            case "+" -> {
                double ans = Operators.add(num1, num2);
                ANS.loop(ans);
            }
            case "-" -> {
                double ans = Operators2.sub(num1, num2);
                ANS.loop(ans);
            }
            case "*" -> {
                double ans = Operators3.mult(num1, num2);
                ANS.loop(ans);
            }
            case "/" -> {
                double ans = Operator4.div(num1, num2);
                ANS.loop(ans);
            }
            case "^" -> {
                double ans = Operators5.pow(num1, num2);
                ANS.loop(ans);
            }
            case "|" -> {
                double ans = Operators6.sqrt(num1, num2);
                ANS.loop(ans);
            }
            default -> {
                out.println("Unexpected operator: " + operator);
                Program.initialCalculate();
            }

        }
        return sum;
    }
}





