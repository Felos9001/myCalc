
import java.util.Scanner;

import static java.lang.System.*;

public class Program {

    public static double sum = 0;

    public static void main(String[] args) {
        Program.Calculate();

    }


    static double Calculate() {


        Scanner input = new Scanner(System.in);

        out.println("Enter Your number (1)");
        double num1 = input.nextDouble();


        String operator;
        out.println("What operator do you want to use(+, -, *, /, ^, |)");
        operator = input.next();

        out.println("Enter Your number (2)");
        double num2 = input.nextDouble();

        switch (operator) {
            case "+" -> {
                Operators.add(num1, num2);
                num1 = Operators.sum;
                ANS.loop(num1);
            }
            case "-" -> {
                Operators2.sub(num1, num2);
                num1 = Operators2.sum;
                ANS.loop(num1);
            }
            case "*" -> {
                Operators3.mult(num1, num2);
                ANS.loop(num1);
            }
            case "/" -> {
                Operator4.div(num1, num2);
                ANS.loop(num1);
            }
            case "^" -> {
                Operators5.pow(num1, num2);
                ANS.loop(num1);
            }
            case "|" -> {
                Operators6.sqrt(num1, num2);
                ANS.loop(num1);
            }
            default -> {
                out.println("Unexpected operator: " + operator);
                Program.Calculate();
            }

        }
        return sum;
    }
}




