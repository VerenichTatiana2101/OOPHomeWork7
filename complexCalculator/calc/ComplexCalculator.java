package complexCalculator.calc;

import complexCalculator.model.Complex;

public final class ComplexCalculator implements Calculable<Complex> {
    private Complex num1;
    private Complex num2;

    public ComplexCalculator(Complex num1, Complex num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ComplexCalculator() {
    }

    @Override
    public Complex sum(Complex num1, Complex num2) {
        double real = num1.getReal() + num2.getReal();
        double imaginary = num1.getImaginary() + num2.getImaginary();
        Complex result = new Complex(real, imaginary);
        return result;
    }

    @Override
    public Complex difference(Complex num1, Complex num2) {
        double real = num1.getReal() - num2.getReal();
        double imaginary = num1.getImaginary() - num2.getImaginary();
        Complex result = new Complex(real, imaginary);
        return result;
    }

    @Override
    public Complex multiplication(Complex num1, Complex num2) {
        double real = (num1.getReal() * num2.getReal())
                + (num1.getImaginary() * num2.getImaginary() * (-1));
        double imaginary = (num1.getReal() * num2.getImaginary()) + (num2.getReal() * num1.getImaginary());
        Complex result = new Complex(real, imaginary);
        return result;
    }

    @Override
    public Complex division(Complex num1, Complex num2) {
        double real = (num1.getReal() * num2.getReal()) + (num1.getImaginary() * num2.getImaginary()
                / (Math.sqrt(num2.getReal()) - (Math.sqrt(num2.getImaginary()) * (-1))));
        double imaginary = (num1.getReal() * num2.getImaginary() * (-1)) + (num2.getReal()
                * num1.getImaginary() / (Math.sqrt(num2.getReal()) - (Math.sqrt(num2.getImaginary()) * (-1))));
        Complex result = new Complex(real, imaginary);
        return result;
    }
}
