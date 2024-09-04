public class Main {
    public static void main(String[] args) {
        Function f1 = new Power(2); // Represents x^2
        Function f2 = new Log(10);  // Represents log_10(x)

        Function addition = new Addition(f1, f2); // Represents x^2 + log_10(x)

        double result = addition.calculate(5); // Calculates f1(5) + f2(5)
        System.out.println("Result: " + result);
    }
}
