package ua.step.example.model.task01;

/**
 * 
 * Абстракция интструмента
 *
 */
public class Instrument
{
    private String name;

    public Instrument(String name)
    {
        this.name = name;
    }

    /**
     * Защищенный метод, доступен только в наследниках класса 
     */
    protected String getName()
    {
        return name;
    }
    
    /**
     * Интерфейс класса 
     */
    public void play()
    {
        System.out.println("Инструмент не может звучать, так как он абстрактный ");
    }
}
