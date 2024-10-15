package ua.step.example;

import ua.step.example.model.task04.Printable;

/**
 * Перегрузка методов в интерфейсе
 */
public class Task06
{
    public static void main(String[] args)
    {
        Printable console = new PrintConsole("Консоль");
        print(console);
        print(console, " текст");
    }

    // полимрфный меод
    static void print(Printable printable)
    {
        printable.print();
    }

    static void print(Printable printable, String text)
    {
        printable.print(text);
    }
}
/**
 * Реализация интерфейса Printable
 */
class PrintConsole implements Printable
{
    private final String text;

    public PrintConsole(String text)
    {
        this.text = text;
    }

    @Override
    public void print()
    {
        System.out.println(text);
    }

    @Override
    public void print(String header)
    {
        System.out.println(header);
        System.out.println(text);
    }
}