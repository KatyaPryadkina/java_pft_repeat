package ru.srqa.pft.sandbox;        //указание,что класс MyFirstProgram лежит в пакете (архитектура вложенных директорий)

public class MyFirstProgram_1_9 {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Katya");

        Square_1_8 s = new Square_1_8(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());                   //s.area() - обращение к методу,   который ассоциирован с обьектом (как раньше делали при обращении к атрибуту обьекта s.l)


        Rectangle_1_8 r = new Rectangle_1_8(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String somebody) {                                                                 //static- чтобы, помечать фун-ию, которая не ассоциирована ни с каким обьектом
        System.out.println("Hello,  " + somebody + "!");
    }





}
