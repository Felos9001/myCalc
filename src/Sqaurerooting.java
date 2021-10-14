

class Operators6 {
    public static double sum = 0;
    public static double sqrt(double num1, double num2) {

        sum = Math.pow(num1, 1/num2);
        System.out.println(num2+ "√" +num1+ " = " +sum);
        return (sum);
    }
}
