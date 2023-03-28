package ru.srqa.pft.sandbox;        //указание,что класс MyFirstProgram лежит в пакете (архитектура вложенных директорий)

public class MyFirstProgram_1_8 {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Katya");

        Square_1_8 s = new Square_1_8(5);                                                //создание нового обьекта Класса, надо писать когда мы обращаемся к обьекту класса
        /*s.l = 5;                                                                            прописываем не ее тип, а ч/з точку обращения к классу. или вообще не пишем, если есть конструктор*/
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));                //обращение к переменной l через новый обьект класса s

        Rectangle_1_8 r = new Rectangle_1_8(4,6);
       // r.a = 4;
       // r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }

    public static void hello(String somebody) {                                    //функция c параметром,  void - ничто,пустота. Функция не возвращает никакого значения
        System.out.println("Hello,  " + somebody + "!");
    }

    public static double area(Square_1_8 s) {                                           //в параметрах указан класс =s, и переменные обьявлены ч/з точку, т.к являются обьектами этого класса
        return s.l * s.l;
    }

    public static double area(Rectangle_1_8 r) {                                        //одинаковое название ф-ий не перепутать, ибо типы параметров разные (разные классы)
        return r.a * r.b;
    }

}
