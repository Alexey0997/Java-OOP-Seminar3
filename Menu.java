/*
Создать класс-коллекцию фигур, в котором реализовать следующие методы:
1.	Вывода информации о всех периметрах, площадях и длинах окружности всех фигур, где это возможно.
2.	Добавления новой фигуры.
3.	Удаления фигуры.
4.	Изменения фигуры по индексу.
5.	Сортировки по площади.
6.	Вывод информации о всех фигурах.

При создании фигур необходимо осуществлять проверку входных данных
на возможность создания данной фигуры и в случае ошибки выдавать соответствующие сообщения. Продумать собственную иерархию исключений.
*/

import java.util.*;

public class Menu {

    // МЕТОД ВЫВОДА ДАННАХ О РАЗЛИЧНЫХ ВИДАХ ПРОДУКТОВ
    protected static void getData(LinkedList<Figures> figures) {

        // МЕНЮ ДЛЯ ВЗАИМОДЕЙСТВИЯ С ПОЛЬЗОВАТЕЛЕМ
        System.out.print("""
                Уважаемый пользователь,
                для управления базой данных "Геометрические фигуры" выберете одно из следующих действий:
                Вывести информацию о площадах и периметрах (длинах окружности) всех фигур    - нажмите 1
                Добавить новую фигуру                                                        - нажмите 2
                Удалить фигуру                                                               - нажмите 3
                Изменить фигуру по индексу                                                   - нажмите 4
                Сортировать фигуры по площади                                                - нажмите 5
                Вывести информацию о всех фигурах                                            - нажмите 6
                Ваше решение: \s""");
        Scanner aScanner = new Scanner(System.in);
        int decisionNumber = aScanner.nextInt();
        if (decisionNumber > 0 & decisionNumber< 7){
            // ВАРИАНТЫ ВЗАИМОДЕЙСТВИЯ, ПРЕДЛАГАЕМЫЕ В ЗАВИСИМОСТИ ОТ РЕШЕНИЯ ПОЛЬЗОВАТЕЛЯ.
            switch (decisionNumber) {

                case 1 -> {
                    // ВЫВОД ИНФОРМАЦИИ О ПЛОЩАДЯХ И ПЕРИМЕТРАХ (ДЛИНАХ ОКРУЖНОСТИ) ВСЕХ ФИГУР
                    System.out.println("\nПЕРИМЕТРЫ МНОГОУГОЛЬНИКОВ: ");
                    for (int i = 0; i < figures.size(); i++) {
                        if (figures.get(i) instanceof Perimeter) {
                            System.out.printf("\n№ %s ", i + 1 + " = " + figures.get(i).getClass().getSimpleName()
                                    + "\nПериметр: " + ((Perimeter) figures.get(i)).perimeter());
                        }
                        System.out.println();
                    }
                    System.out.println("\nДЛИНЫ ОКРУЖНОСТЕЙ: ");
                    for (int i = 0; i < figures.size(); i++) {
                        if (figures.get(i) instanceof CircumferenceLength) {
                            System.out.printf("\n№ %s\n ", i + 1 + " = " + figures.get(i).getClass().getSimpleName()
                                    + "\nДлина окружности: " + ((CircumferenceLength) figures.get(i)).circumerenceLength());
                        }
                    }
                    System.out.println("\nПЛОЩАДИ ФИГУР: ");
                    for (int i = 0; i < figures.size(); i++) {
                        System.out.printf("\n№ %s\n ", i + 1 + " = " + figures.get(i).getClass().getSimpleName()
                                    + "\nПлощадь: " + figures.get(i).figureArea());
                        }
                    System.out.println();
                    getData(figures);
                    }

                    // МЕТОД ДОБАВЛЕНИЯ ФИГУР В БАЗУ ДАННЫХ
                case 2 -> {
                    System.out.println("\nУКАЖИТЕ № ФИГУРЫ, КОТОРУЮ ХОТИТЕ ДОБАВИТЬ: ");
                    System.out.print("""
                            Прямоугольник  - нажмите 1
                            Квадрат        - нажмите 2
                            Треугольник    - нажмите 3
                            Круг           - нажмите 4
                            Ваше решение: \s""");
                    Scanner fScanner = new Scanner(System.in);
                    int addNumber = fScanner.nextInt();
                    if (addNumber > 0 & addNumber < 5) {
                        if (addNumber == 1) {                                                     // Добавляем прямоугольник.
                            System.out.print("\nДлина: ");
                            Scanner gScanner = new Scanner(System.in);
                            double sideA = gScanner.nextDouble();
                            if (sideA <= 0) {
                                System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                                getData(figures);
                            }
                            System.out.print("Ширина: ");
                            Scanner hScanner = new Scanner(System.in);
                            double sideB = hScanner.nextDouble();
                            if (sideB <= 0) {
                                System.out.printf("Число %s", sideB + " не является положительным. Введите ширину > 0.\n");
                                getData(figures);
                            }
                            Figures newRectangle = new Rectangle(sideA, sideB);
                            System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newRectangle);
                            figures.add(newRectangle);
                            System.out.println();
                            getData(figures);
                        }
                    }
                    if (addNumber == 2) {                                                             // Добавляем квадрат.
                        System.out.print("\nСторона квадрата: ");
                        Scanner gScanner = new Scanner(System.in);
                        double sideA = gScanner.nextDouble();
                        if (sideA <= 0) {
                            System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        Figures newSquare = new Square(sideA, sideA);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newSquare);
                        figures.add(newSquare);
                        System.out.println();
                        getData(figures);
                    }
                    if (addNumber == 3) {                                                          // Добавляем треугольник.
                        System.out.print("\nСторона A: ");
                        Scanner gScanner = new Scanner(System.in);
                        double sideA = gScanner.nextDouble();
                        if (sideA <= 0) {
                            System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        System.out.print("\nСторона B: ");
                        Scanner hScanner = new Scanner(System.in);
                        double sideB = hScanner.nextDouble();
                        if (sideB <= 0) {
                            System.out.printf("Число %s", sideB + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        System.out.print("\nСторона B: ");
                        Scanner iScanner = new Scanner(System.in);
                        double sideC = iScanner.nextDouble();
                        if (sideC <= 0) {
                            System.out.printf("Число %s", sideC + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        if (sideA > sideB + sideC || sideB > sideC + sideA || sideC > sideA + sideB) {
                            System.out.println("Сумма длин двух сторон треугольника не должна превышать длину третей стороны " +
                                    "введите, пожалуйста, точные данные.\n");
                            System.out.println();
                            getData(figures);
                        }
                        Figures newTriangle = new Triangle(sideA, sideB, sideC);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newTriangle);
                        figures.add(newTriangle);
                        System.out.println();
                        getData(figures);
                    }
                    if (addNumber == 4) {                                                                 // Добавляем круг.
                        System.out.print("\nРадиус: ");
                        Scanner gScanner = new Scanner(System.in);
                        double radius = gScanner.nextDouble();
                        if (radius <= 0) {
                            System.out.printf("Число %s", radius + " не является положительным. Введите радиус > 0.");
                            getData(figures);
                        }
                        Figures newCircle = new Circle(radius);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newCircle);
                        figures.add(newCircle);
                        System.out.println();
                        getData(figures);
                    }
                }

                // МЕТОД УДАЛЕНИЯ ФИГУР ИЗ БАЗЫ ДАННЫХ
                case 3 -> {
                    System.out.println("\nУКАЖИТЕ ФИГУРУ, КОТОРУЮ ХОТИТЕ УДАЛИТЬ: ");
                    for (int i = 0; i < figures.size(); i++) {
                        System.out.printf("\n№ %s\n", i + 1 + " = " + figures.get(i).getClass().getSimpleName());
                    }
                    System.out.println("\nВаше решение: ");
                    Scanner bScanner = new Scanner(System.in);
                    int delIndex = bScanner.nextInt();
                    if (delIndex - 1 < figures.size()) {
                        System.out.printf("\nУдален: %s", figures.get(delIndex - 1).getClass().getSimpleName());
                        figures.remove(delIndex - 1);
                        System.out.println("\nВ базе данных остались следующие фигуры: ");
                        for (int i = 0; i < figures.size(); i++) {
                            System.out.printf("\n№ %s\n", i + 1 + " = " + figures.get(i).getClass().getSimpleName());
                        }
                        System.out.println();
                        getData(figures);
                    } else System.out.println("Такого номера нет в списке.");
                    System.out.println();
                    getData(figures);
                }

                // МЕТОД ИЗМЕНЕНИЯ ФИГУР
                case 4 -> {
                    System.out.println("\nУКАЖИТЕ ФИГУРУ, КОТОРУЮ ХОТИТЕ ИЗМЕНИТЬ: ");
                    for (int i = 0; i < figures.size(); i++) {
                        System.out.printf("\n№ %s\n", i + 1 + " = " + figures.get(i).getClass().getSimpleName());
                    }
                    System.out.println("\nВаше решение: ");
                    Scanner bScanner = new Scanner(System.in);
                    int changeIndex = bScanner.nextInt();
                    System.out.printf("\nВы хотите изменить: %s\n", figures.get(changeIndex - 1).getClass().getSimpleName());

                    // МЕТОД ИЗМЕНЕНИЯ ПРЯМОУГОЛЬНИКА
                    if (figures.get(changeIndex - 1).getClass().equals(Rectangle.class)){
                        figures.remove(changeIndex - 1);
                        System.out.print("\nДлина: ");
                        Scanner gScanner = new Scanner(System.in);
                        double sideA = gScanner.nextDouble();
                        if (sideA <= 0) {
                            System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        System.out.print("Ширина: ");
                        Scanner hScanner = new Scanner(System.in);
                        double sideB = hScanner.nextDouble();
                        if (sideB <= 0) {
                            System.out.printf("Число %s", sideB + " не является положительным. Введите ширину > 0.\n");
                            getData(figures);
                        }
                        Figures newRectangle = new Rectangle(sideA, sideB);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newRectangle);
                        figures.add(newRectangle);
                        System.out.println();
                        getData(figures);
                    }

                    // МЕТОД ИЗМЕНЕНИЯ КВАДРАТА
                    if (figures.get(changeIndex - 1).getClass().equals(Square.class)){
                        figures.remove(changeIndex - 1);
                        System.out.print("\nСторона квадрата: ");
                        Scanner gScanner = new Scanner(System.in);
                        double sideA = gScanner.nextDouble();
                        if (sideA <= 0) {
                            System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        Figures newSquare = new Square(sideA, sideA);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newSquare);
                        figures.add(newSquare);
                        System.out.println();
                        getData(figures);
                    }

                    // МЕТОД ИЗМЕНЕНИЯ ТРЕУГОЛЬНИКА
                    if (figures.get(changeIndex - 1).getClass().equals(Triangle.class)) {
                        figures.remove(changeIndex - 1);
                        System.out.print("\nСторона A: ");
                        Scanner gScanner = new Scanner(System.in);
                        double sideA = gScanner.nextDouble();
                        if (sideA <= 0) {
                            System.out.printf("Число %s", sideA + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        System.out.print("\nСторона B: ");
                        Scanner hScanner = new Scanner(System.in);
                        double sideB = hScanner.nextDouble();
                        if (sideB <= 0) {
                            System.out.printf("Число %s", sideB + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        System.out.print("\nСторона B: ");
                        Scanner iScanner = new Scanner(System.in);
                        double sideC = iScanner.nextDouble();
                        if (sideC <= 0) {
                            System.out.printf("Число %s", sideC + " не является положительным. Введите длину > 0.");
                            getData(figures);
                        }
                        if (sideA > sideB + sideC || sideB > sideC + sideA || sideC > sideA + sideB) {
                            System.out.println("Сумма длин двух сторон треугольника не должна превышать длину третей стороны " +
                                    "введите, пожалуйста, точные данные.\n");
                            System.out.println();
                            getData(figures);
                        }
                        Figures newTriangle = new Triangle(sideA, sideB, sideC);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newTriangle);
                        figures.add(newTriangle);
                        System.out.println();
                        getData(figures);
                    }
                    // МЕТОД ИЗМЕНЕНИЯ КРУГА
                    if (figures.get(changeIndex - 1).getClass().equals(Circle.class)) {
                        figures.remove(changeIndex - 1);
                        System.out.print("\nРадиус: ");
                        Scanner gScanner = new Scanner(System.in);
                        double radius = gScanner.nextDouble();
                        if (radius <= 0) {
                            System.out.printf("Число %s", radius + " не является положительным. Введите радиус > 0.");
                            getData(figures);
                        }
                        Figures newCircle = new Circle(radius);
                        System.out.printf("\nВы добавили фигуру со следующими характеристиками: %s\n", newCircle);
                        figures.add(newCircle);
                        System.out.println();
                        getData(figures);
                    }
                }

                // МЕТОД СОРТРИРОВКИ МАССИВА ПО ПЛОЩАДИ В ПОРЯДКЕ УБЫВАНИЯ
                case 5 -> {
                    System.out.println("\nПЛОЩАДИ ФИГУР: ");
                    ArrayList<Object> areas = new ArrayList<>();
                    for (Figures figure : figures) {
                        areas.add(figure.figureArea());
                    }
                    areas.sort(Collections.reverseOrder());
                    for (Object area : areas) {
                        for (Figures figure : figures) {
                            if (area.equals(figure.figureArea())) {
                                System.out.printf("\nФигура:  %s\n", figure.getClass().getSimpleName());
                                System.out.printf("Площадь: %s\n", area);

                            }
                        }
                    }
                    System.out.println();
                    getData(figures);
                }

                // МЕТОД ВЫВОДА СВЕДЕНИЙ О ВСЕХ ФИГУРАХ БАЗЫ ДАННЫХ
                case 6 -> {
                    for (int i = 0; i < figures.size(); i++) {
                        System.out.printf("\n№ %s\n %s\n", i + 1 + " = " + figures.get(i).getClass().getSimpleName(), figures.get(i));
                    }
                    System.out.println();
                    getData(figures);
                }
            }
        }

        // ПРОВЕРКА ПРАВИЛЬНОСТИ ВВОДА ДАННЫХ ПОЛЬЗОВАТЕЛЕМ ПРИ РАБОТЕ С МЕНЮ
        else {
            System.out.printf("В списке нет числа %s\n", decisionNumber + ". Введите корректное значение.");
            System.out.println();
            getData(figures);
        }
    }
}

