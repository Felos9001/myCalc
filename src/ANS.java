import java.util.Scanner;

import static java.lang.System.out;


public class ANS {

     static double sum = 0;

    public static void loop(double num1) {

        Scanner input = new Scanner(System.in);
        out.println("would you like to continue(y/n)");
        String answer = input.next();

        if (answer.equals("y")) {

            out.println("what number would you like to use?");
            double num2 = input.nextDouble();

            String operator;
            out.println("What operator do you want to use(+, -, *, /, ^, |)");
            operator = input.next();

            switch (operator) {
                case "+" -> {
                    num1 = Program.sum;
                    Operators.add(num1, num2);
                    ANS.loop(num1);
                }
                case "-" -> {
                    num1 = Program.sum;
                    Operators2.sub(num1, num2);
                    ANS.loop(num1);
                    }
                case "*" -> {
                    num1 = Operators3.sum;
                    Operators3.mult(num1, num2);
                    ANS.loop(num1);
                }
                case "/" -> {
                    num1 = Operator4.sum;
                    Operator4.div(num1, num2);
                    ANS.loop(num1);
                }
                case "^" -> {
                    num1 = Operators5.sum;
                    Operators5.pow(num1, num2);
                    ANS.loop(num1);
                }
                case "|" -> {
                    num1 = Operators6.sum;
                    Operators6.sqrt(num1, num2);
                    ANS.loop(num1);
                }
                default -> {
                    out.println("Unexpected operator: " + operator);
                    Program.Calculate();
                }
            }
        } else {
            Program.Calculate();
        }
    }
}
