package ITMO.HWITMO.Calc;

public class Multiplication extends Operation {
    @Override
    protected double execute(double a, double b) {
        System.out.println("Выполняется умножение " + (a * b));
        return a * b;
    }
}
