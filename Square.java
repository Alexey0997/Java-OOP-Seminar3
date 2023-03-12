import java.util.Comparator;

/*
Для фигуры использовать базовый абстрактный класс фигуры,
у которого есть методы посчитать периметр и посчитать площадь фигуры.
*/
public class Square extends Rectangle implements Perimeter{

    // ПОЛЯ КЛАССА SQUARE (КВАДРАТ)
    private String name = "Квадрат";
    double[] squareSides = new double[]{sideA, sideA, sideB, sideB};




    // КОНСТРУКТОР КЛАССА SQUARE
    public Square(double sideA, double sideB) {
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


    // МЕТОДЫ КЛАССА SQUARE
    @Override
    public double figureArea() {            // Расчет площади прямоугольника.
        double scale = Math.pow(10, 2);
        return Math.ceil(sideA * sideB * scale) / scale;
    }

    @Override
    public Double perimeter() {              // Расчет периметра прямоугольника.
        double perSquare = 0;
        for (double side : squareSides) {
            perSquare += side;
        }
        return perSquare;
    }
}
