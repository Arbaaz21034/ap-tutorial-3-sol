
public class Log implements Function {
    private double base;

    public Log(double base) {
        this.base = base;
    }

    @Override
    public double calculate(double x) {
        return Math.log(x) / Math.log(base);
    }

    @Override
    public Function differentiate() {
        // Differentiation rule: d/dx[log_a(x)] = 1 / (x * ln(a))
        return new Constant(1 / (Math.log(base)));
    }

    @Override
    public Function integrate() {
        // Integration of log function is not elementary, so let's return a constant.
        return new Constant(1);
    }
}



