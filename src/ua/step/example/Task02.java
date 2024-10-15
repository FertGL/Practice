package ua.step.example;

import ua.step.example.model.task01.Drum;
import ua.step.example.model.task01.Instrument;
import ua.step.example.model.task01.Trumpet;

/**
 * 
 * Ковариантность массива. Ковариантностью называется сохранение иерархии
 * наследования исходных типов в производных типах в том же порядке. Массивы в
 * Java ковариантны с самой первой версии. (Если бы этого не было, то для
 * использования, например, библиотечного метода, принимающего массив объектов
 * Object[], для работы с массивом строк String[], требовалось бы его сначала
 * скопировать в новый массив Object[].) Поскольку, как было сказано выше, при
 * записи элемента в такой массив можно обойти контроль типов, в JVM существует
 * дополнительный контроль во время выполнения, генерирующий исключение при
 * записи некорректного элемента.
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Instrument[] instruments = new Instrument[4];
        Drum[] drums = new Drum[4];

        // массив барабанов можно расмотреть как массив инструментов, это и есть
        // ковариантность
        instruments = drums;

        // но массив барабанов все еще остается массивом барабанов и добавление
        // в него инструмента другого типа вызовет ошибку во время выполнения
        /******************************/
         instruments[0] = new Trumpet();
        /******************************/

        instruments[1] = new Drum();
        play(instruments);
        // FIXME расскоментируй строку 32
    }

    /**
     * Полиморфный метод
     */
    public static void play(Instrument[] instruments)
    {
        for (Instrument instrument : instruments)
        {
            if (instrument != null)
            {
                instrument.play();
            }
        }
    }
}