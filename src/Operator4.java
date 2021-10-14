

    public class Operator4 {
        public static double sum = 0;
        public static double div(double num1, double num2) {

            sum = num1 / num2;
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + sum);
            } else {
                System.out.println("Cannot divide by Zero - Error");
            }
            return sum;
        }
    }
