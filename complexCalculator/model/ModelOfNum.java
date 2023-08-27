package complexCalculator.model;

public abstract class ModelOfNum {
    double real;

    public ModelOfNum(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
}
