package ua.step.example.model.task04;

/**
 * Класс, который собирается использовать определённый интерфейс, использует
 * ключевое слово implements. Оно указывает, что интерфейс лишь определяет
 * форму, а вам нужно наполнить кодом. Методы, которые реализуют интерфейс,
 * должны быть объявлены как public.
 */
public class Rectangle implements Drawable
{
    private int width = 4 ;
    
    public void draw()
    {
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}