package ru.srqa.pft.sandbox;        //указание,что класс MyFirstProgram лежит в пакете (архитектура вложенных директорий)

public class MyFirstProgram_1_7 {

    public static void main(String[] args) {                                        //в ф-ии main обращение к функции
        hello("world");                                                                    //необходимо указать конкретное значение параметра для фук-ии
        hello("user");
        hello("Katya");

        double l = 5;                                                               //переменная определена в рамках фиг.скобок и эта l не пересекается с area l
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a =4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
    }

    public static void hello(String somebody) {                                    //функция c параметром,  void - ничто,пустота. Функция не возвращает никакого значения
        System.out.println("Hello,  " + somebody + "!");
    }

    public static double area(double l) {                                  //функцичя с возвращ.значен. явного типа double + return
        return l * l;
    }

    public static double area(double a, double b) {                                 //функции с одним именем имеют разные параметры, и не перепутываются
        return a * b;
    }

}
