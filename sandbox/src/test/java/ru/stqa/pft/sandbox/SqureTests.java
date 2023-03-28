package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;                                                 //импорт, для название класса коротким образом типа @Tests
import ru.srqa.pft.sandbox.Square_1_8;

public class SqureTests {                                               //main не надо, потому  что тестовый фреймворк запучскается: находит тесты, выполняет, делает отчет. Только методы тестов писать

    @Test                                                               //аннотация  - название класса перед  методом
    public void testArea() {                                                //параметров нет, возвращаемого результата нет

        Square_1_8 s = new Square_1_8(5);
 //       assert s.area() == 25 ;                                             //для сравнения 2-х величин ==, = -> присваивание
        Assert.assertEquals(s.area(), 25.0);                              //функция static можно к ней напрямую обратиться ч/з импорт. Используется для подробной ошибки при падении теста , по сравнению с предыдущей строкой

    }
}
