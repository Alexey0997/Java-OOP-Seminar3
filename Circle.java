/*
Для фигуры использовать базовый абстрактный класс фигуры,
у которого есть методы посчитать периметр и посчитать площадь фигуры.
*/
public class Circle extends Figures implements CircumferenceLength{

    // ПОЛЯ КЛАССА CIRCLE (КРУГ)
    private String name = "Круг";
    public double radius;

    // КОНСТРУКТОР КЛАССА CIRCLE
    public Circle (double radius) {
        this.radius = radius;
    }

    // ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nНазвание фигуры:      " + name +
                "\nРадиус,           см: " + radius +
                "\nДлина окружности, см: " + circumerenceLength() +
                "\nПлощадь круга, кв.см: " + figureArea();
    }

    // МЕТОДЫ КЛАССА CIRCLE
    @Override
    public double figureArea() {                                               // Расчет площади круга.
        double scale = Math.pow(10, 2);
        return Math.ceil(Math.PI * (radius * radius) * scale) / scale;
    }

    @Override
    public Double circumerenceLength() {                                       // Расчет длины окружности.
        double scale = Math.pow(10, 2);
        return Math.ceil(Math.PI * 2 * radius * scale) / scale;
    }
}
