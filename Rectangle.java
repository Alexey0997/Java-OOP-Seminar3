import java.util.Comparator;

/*
Для фигуры использовать базовый абстрактный класс фигуры,
у которого есть методы посчитать периметр и посчитать площадь фигуры.
*/
public class Rectangle extends Polygons implements Perimeter{

    // ПОЛЯ КЛАССА RECTANGLE (ПРЯМОУГОЛЬНИК)
    private String name = "Прямоугольник";
    double[] recSides = new double[]{sideA, sideA, sideB, sideB};

    // КОНСТРУКТОР КЛАССА RECTANGLE
    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    // ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nНазвание фигуры: " + name +
                "\nДлина,       см: " + sideA +
                "\nШирина,      см: " + sideB +
                "\nПериметр,    см: " + perimeter() +
                "\nПлощадь,  кв.см: " + figureArea();
    }

    // МЕТОДЫ КЛАССА RECTANGLE
    @Override                                                  // Расчет периметра прямоугольника.
    public Double perimeter() {
        double sum = 0;
        for (double side : recSides) {
            sum += side;
        }
//        System.out.printf("Периметр прямоугольника %f", perRectangle);
        return sum;
    }

    @Override
    public double figureArea() {                               // Расчет площади прямоугольника.
        double scale = Math.pow(10, 2);
        return Math.ceil(sideA * sideB * scale) / scale;

    }



}
