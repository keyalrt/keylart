package ITMO.HWITMO.Calc;

public class Subtraction extends Operation {
    @Override
    protected double execute(double a, double b) {
        System.out.println("Выполняется вычитание" + (a - b));
        return a - b;
    }
}
