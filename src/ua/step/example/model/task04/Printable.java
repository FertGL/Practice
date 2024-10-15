package ua.step.example.model.task04;

/**
 * 
 * Интерфейс
 *
 */
public interface Printable
{
    final int lineSize = 80;
    static int startPageNumber = 1;
    // int x; // ошибка компиляции

    // абстрактный метод - ключевое слово abstract можно не указывать
    void print();

    abstract void print(String header);
    // int print(char c){} // ошибка компиляции
}