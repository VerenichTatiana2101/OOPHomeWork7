package complexCalculator.calc;

import complexCalculator.model.ModelOfNum;

public interface Calculable<T extends ModelOfNum> {
    T sum(T num1, T num2);

    T difference(T num1, T num2);

    T multiplication(T num1, T num2);

    T division(T num1, T num2);

}
