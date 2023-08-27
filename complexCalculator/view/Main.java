package complexCalculator.view;

import complexCalculator.calc.Calculable;
import complexCalculator.calc.ComplexCalculator;
import complexCalculator.log.ComplexLogger;
import complexCalculator.log.Logger;
import complexCalculator.model.Complex;


public class Main {
    public static void main(String[] args) {
        Calculable<Complex> calculator = new ComplexLogger(new ComplexCalculator(), new Logger());
        ViewCalculator calculatorView = new ViewCalculator(calculator);
        calculatorView.run();
    }

}
