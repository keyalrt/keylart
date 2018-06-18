package ITMO.HWITMO.Calc;

public class Summation extends Operation{
    @Override
    protected double execute(double a, double b) {
        System.out.println("Выполняется сложение" + (a + b));
        return a + b;
    }
}