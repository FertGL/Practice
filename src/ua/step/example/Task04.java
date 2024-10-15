package ua.step.example;

import ua.step.example.model.task04.Drawable;
import ua.step.example.model.task04.Rectangle;

/**
 * 
 * Интерфейс - как структура языка
 *
 */
public class Task04
{
    public static void main(String[] args)
    {
        System.out.println(Drawable.def);
        // Drawable.def = 5;

        Drawable circle = new Rectangle();
        drawShape(circle);
        System.out.println();
        // FIXME добавь создание объекта треуголник и печать его с помошью
        // метода drawShape
    }

    /**
     * Поиморфный метод рисует фигуруы не вдаваясь в реализацию
     */
    public static void drawShape(Drawable drawable)
    {
        drawable.draw();
    }

    public static void drawShape(Drawable[] drawables)
    {
        for (Drawable drawable : drawables)
        {
            drawable.draw();
        }
    }
}