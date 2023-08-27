package complexCalculator.model;

public class Complex extends ModelOfNum {

    double imaginary;
    public Complex(double real, double imaginary) {
        super(real);
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return  super.getReal() + " + " + imaginary + "i";
    }
}
