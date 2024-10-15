package ua.step.example;

import ua.step.example.model.task04.Printable;

/**
 * Проблема связанная с реализацией двух интерфейсов с одинаковой сигнатурой
 * метода.
 */
public class Task07
{
    public static void main(String[] args)
    {
        Document document = new Document();
        document.print();
    }
}

interface Display
{
    public void print(String header);
}

class Document implements Printable, Display
{
    // реализация метода из двух интерфейсов
    public void print()
    {
        System.out.println("Что делать? Печатать на принтер или выводить на экран?");
    }

    @Override
    public void print(String header)
    {
        System.out.println(header);
    }
}