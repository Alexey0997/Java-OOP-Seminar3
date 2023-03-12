public abstract class Polygons extends Figures implements Perimeter{

    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА POLYGONS (МНОГОУГОЛЬНИК)
    double sideA;
    double sideB;

    // КОНСТРУКТОР КЛАССА RECTANGLE
    public Polygons(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // ОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nДлина, см.: " + sideA +
                "\nШирина, см: " + sideB;
    }


}
