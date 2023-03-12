import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // СОЗДАЕМ ИСХОДЫЙ СПИСОК ФИГУР В БАЗЕ ДАННЫХ
        LinkedList<Figures> figures = new LinkedList<>();
        Figures rectangle = new Rectangle(4, 6);
        Figures square = new Square(3, 3);
        Figures triangle = new Triangle(5, 5, 7);
        Figures circle = new Circle(10);

        figures.add(rectangle);
        figures.add(square);
        figures.add(triangle);
        figures.add(circle);

        // ВЫЗЫВАЕМ МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        Menu.getData(figures);
    }
}