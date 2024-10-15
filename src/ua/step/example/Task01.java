package ua.step.example;

import ua.step.example.model.task01.Drum;
import ua.step.example.model.task01.Instrument;
import ua.step.example.model.task01.Trumpet;
import ua.step.example.model.task01.Violin;

/**
 * Полиморфизм
 */
public class Task01
{
    public static void main(String[] args)
    {
        Instrument instrument = new Instrument("Инструмент");
        playInstrument(instrument);

        Instrument instrument1 = new Drum();
        playInstrument(instrument1);

        Instrument instrument2 = new Trumpet();
        playInstrument(instrument2);

        Violin violin = new Violin();
        playInstrument(violin);

        // FIXME Создайте объект класса Violin и передайте его в метод
    }

    /**
     * Полиморфный метод. Метод работает с абстракцией инструмент.
     */
    private static void playInstrument(Instrument instrument)
    {
        // в этом месте происходит динамическое определения типа объекта
        // у которого должен быть вызван метод play
        instrument.play();
    }
}