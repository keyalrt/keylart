package ITMO.HWITMO;

//Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
// Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).
public class Figures_HW28_03 {
    public double heigh;
    public double wide;
    public String name;
    public double radius;
    public int side1;
    public int side2;
    public int side3;

    Figures_HW28_03 (String name, double heigh, double wide) {
        this.name=name;
        this.heigh = heigh;
        this.wide = wide;
    }

    Figures_HW28_03 (String name, int side1, int side2, int side3) {
       this.name = name;
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }

    Figures_HW28_03 (String name, double radius) {
       this.name = name;
       this.radius = radius;
    }

    public double squareRectangle () {
       return heigh*wide;
    }

    public double squareTriangle () {
        double x = (double)(side1+side2+side3)/2;
        return Math.sqrt(x * (x-side1)* (x-side2) * (x-side3));
    }

    public double squareCircle () {
        double n = (3.14 * (radius*radius));
        return n;
            }

    public double perimetrRectangle() {
        return 2 * (heigh+wide);
    }

    public int perimetrTirangle() {
        return side1 + side2 + side3;
    }

    public double perimetrCircle () {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Figures_HW28_03 rectangle1 = new Figures_HW28_03("Прямоугольник 1", 3.0 , 7.0);
        Figures_HW28_03 triangle1 = new Figures_HW28_03("Треугольник 1", 2, 5, 4 );
        Figures_HW28_03 circle1 = new Figures_HW28_03("Круг 1 ", 8);


        System.out.println("Периметр " + rectangle1.name);
        System.out.println(rectangle1.perimetrRectangle());
        System.out.println("Периметр " + triangle1.name);
        System.out.println( triangle1.perimetrTirangle());
        System.out.println("Периметр " + circle1.name);
        System.out.println(circle1.perimetrCircle());

        System.out.println("Площадь " + rectangle1.name);
        System.out.println(rectangle1.squareRectangle());
        System.out.println("Площадь " + triangle1.name);
        System.out.println( triangle1.squareTriangle());
        System.out.println("Площадь " + circle1.name);
        System.out.println(circle1.squareCircle());

    }
}
