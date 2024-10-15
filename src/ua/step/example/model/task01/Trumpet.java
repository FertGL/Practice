package ua.step.example.model.task01;

/**
 * 
 * Труба
 *
 */
public class Trumpet extends Instrument
{

    public Trumpet()
    {
        super("Труба");
    }

    public void play()
    {
        // super.play(); // вызов метода суперкласса
        System.out.println(getName() + ": Тру-ту-ту");
    }
}
