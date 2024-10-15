package ua.step.example.model.task01;

public class Drum extends Instrument
{
    public Drum()
    {
        super("Барабан 1");
    }

    /**
     * Метод переопределяет исходный метод в суперклассе.
     */
    public void play()
    {
        // super.play(); // вызов метода суперкласса
        System.out.println(getName() + ": Бум-бум-бац");
    }
}