package complexCalculator.log;

import complexCalculator.calc.Calculable;
import complexCalculator.model.Complex;

public class ComplexLogger implements Calculable <Complex> {
    private Calculable calcLog;
    private Loggable logger;

    public ComplexLogger(Calculable calcLog, Loggable logger) {
        this.calcLog = calcLog;
        this.logger = logger;
    }

    @Override
    public Complex sum(Complex num1, Complex num2) {
        Complex result = (Complex) calcLog.sum(num1, num2);
        logger.log(String.format(" (%s) + (%s) = (%s)", num1, num2, result));
        return result;
    }

    @Override
    public Complex difference(Complex num1, Complex num2) {
        Complex result = (Complex) calcLog.difference(num1, num2);
        logger.log(String.format(" (%s) - (%s) = (%s)", num1, num2, result));
        return result;
    }

    @Override
    public Complex multiplication(Complex num1, Complex num2) {
        Complex result = (Complex) calcLog.multiplication(num1, num2);
        logger.log(String.format(" (%s) * (%s) = (%s)", num1, num2, result));
        return result;
    }

    @Override
    public Complex division(Complex num1, Complex num2) {
        Complex result = (Complex) calcLog.division(num1, num2);
        logger.log(String.format(" (%s) / (%s) = (%s)", num1, num2, result));
        return result;
    }
}
