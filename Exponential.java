
public class Exponential implements Function {
    private double base;

    public Exponential(double base) {
        this.base = base;
    }

    @Override
    public double calculate(double x) {
        return Math.pow(base, x);
    }

    @Override
    public Function differentiate() {
        // Differentiation rule: d/dx[a^x] = a^x * ln(a)
        return new Exponential(base);
    }

    @Override
    public Function integrate() {
        // Integration of exponential function: ∫a^x dx = a^x / ln(a)
        return new Exponential(base);
    }
}

