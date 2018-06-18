package ITMO.HWITMO.Calc;

public class Division extends Operation {
    @Override
    protected double execute(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль недопустимо");
            return 0;
        }
        else {
            System.out.println("Выполняется деление " + (a / b));
            return a / b;
        }

    }
}