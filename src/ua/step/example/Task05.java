package ua.step.example;

/**
 * Доступность методов
 */
public class Task05
{
    public static void main(String[] args)
    {
        // расматривая реализацию как интерфейс 
        Interface i = new Realesation();
        i.work();
        // i.say();
        // i.see();
        System.out.println("++++++++++++++++++++");

        // расматривая реализацию как абстакцию 
        AbstractModel abstractModel = new Realesation();
        abstractModel.work();
        abstractModel.say();
        abstractModel.see();
        // abstractModel.eat();
        
        // расматривая реализацию как реализацию
        System.out.println("++++++++++++++++++++");
        Realesation realization = new Realesation();
        realization.work();
        realization.say();
        realization.see();
        realization.eat();
    }
}

interface Interface
{
    public abstract void work(); // абстрактный метод
}

abstract class AbstractModel implements Interface
{
    public void see()
    {
        System.out.println("see");
    }

    abstract void say();
}

class Realesation extends AbstractModel
{
    @Override
    public void work()
    {
        System.out.println("work");

    }

    @Override
    void say()
    {
        System.out.println("say");
    }

    void eat()
    {
        System.out.println("eat");
    }
}