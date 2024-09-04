public class Constant implements Function {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double calculate(double x) {
        return value;
    }

    @Override
    public Function differentiate() {
        // The derivative of a constant is 0.
        return new Constant(0);
    }

    @Override
    public Function integrate() {
        // The integral of a constant is the constant times x.
        return new Constant(value);
    }
}
