
public class Addition implements Function {
    private Function f1, f2;

    public Addition(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double calculate(double x) {
        return f1.calculate(x) + f2.calculate(x);
    }

    @Override
    public Function differentiate() {
        return null; // Not required to differentiate combined functions
    }

    @Override
    public Function integrate() {
        return null; // Not required to integrate combined functions
    }
}