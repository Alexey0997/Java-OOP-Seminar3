import java.util.Comparator;

/*
Для фигуры использовать базовый абстрактный класс фигуры,
у которого есть методы посчитать периметр и посчитать площадь фигуры.
*/
public class Triangle extends Polygons implements Perimeter{

    // ПОЛЯ КЛАССА TRIANGLE (ТРЕУГОЛЬНИК)
    private final String name = "Треугольник";
    public double sideC;


    // ИМПОРТИРУЕМ КОНСТРУКТОР ДЛЯ КЛАССА TRIANGLE
    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    // ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nНазвание фигуры: " + name +
                "\nСторона А, см:   " + sideA +
                "\nСторона В, см:   " + sideB +
                "\nСторона С, см:   " + sideC +
                "\nПериметр,  см:   " + perimeter() +
                "\nПлощадь,кв.см:   " + figureArea();

    }

    // МЕТОДЫ КЛАССА TRIANGLE
    @Override
    public Double perimeter() {                                    // Расчет периметра треугольника.
        double[] triangleSides = new double[]{sideA, sideA, sideC};
        double perTriangle = 0;
        for (double side : triangleSides) {
            perTriangle += side;
        }
        return perTriangle;
    }

    @Override
    public double figureArea() {                                  // Расчет площади треугольника.
        double p = 0.5 * (sideA + sideB + sideC);
        double scale = Math.pow(10, 2);
        return Math.ceil(Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)) * scale) / scale;
    }
}
