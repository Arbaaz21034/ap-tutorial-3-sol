
public class Power implements Function {
    private double a;

    public Power(double a) {
        this.a = a;
    }

    @Override
    public double calculate(double x) {
        return Math.pow(x, a);
    }

    @Override
    public Function differentiate() {
        // Power rule: d/dx[x^a] = a * x^(a-1)
        return new Power(a - 1);
    }

    @Override
    public Function integrate() {
        // Integration rule: ∫x^a dx = x^(a+1)/(a+1)
        return new Power(a + 1);
    }
}

