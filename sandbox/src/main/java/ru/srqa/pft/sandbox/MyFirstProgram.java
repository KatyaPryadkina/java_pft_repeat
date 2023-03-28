package ru.srqa.pft.sandbox;        //указание,что класс MyFirstProgram лежит в пакете (архитектура вложенных директорий)

public class MyFirstProgram {

    public static void main(String[] args) {                        //функция/метод (именованный блок кода с параметрами ф-и () для последующего обращения)
        System.out.println("Hello,world");

        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);


        System.out.println(1 / 2);                                    //в операции целые числа, в результате тож целые числа
        System.out.println(1.0 / 2);                                  //в операции дробные числа, в результате тож дробные числа(с плавающей точкой)
        System.out.println(1 / 2.0);
        System.out.println(2.0 / 2);

        System.out.println("2" + "2");                                    //конкатенация - склеивание строк (только +)
        System.out.println("2" + 2);                                        //число преобразовывается в строку

        System.out.println(2 + 2 * 2);
        System.out.println( (2 + 2) * 2);

        System.out.println("2 + 2 = " + 2 + 2 );                        //выполнена конкатенация, чтобы числа считались, надо заключить их в скобки
        System.out.println("2 + 2 = " + (2 + 2) );


    }

}