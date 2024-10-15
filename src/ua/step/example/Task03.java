package ua.step.example;

/**
 * 
 * Абстрактные классы
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        // Animal a = new Animal(); // нельзя создать экзепляр абстрактного
        // класса
        Animal acat = new Cat(); // формальное приведение типа
        soundAnimal(acat);
        Animal adog = new Dog(); // формальное приведение типа
        soundAnimal(adog);
    }

    // полиморфный метод
    private static void soundAnimal(Animal animal)
    {
        // animal.sound();
    }
}

/**
 * Абстрактный класс - представляет модель объекта которой нельзя создать
 */
abstract class Animal
{
    private String name;
    // абстрактный метод (контракт), не имеет реализации
    
    // public abstract void sound();
    
    // FIXME раскоментируй строчку кода 35 и реализуй методы в классах
    // наследниках

    public String getName()
    {
        return name;
    }
}

// классы наследники обязаны реализовывать все абстрактные методы из
// суперклассов
class Cat extends Animal
{

}

class Dog extends Animal
{

}

class Fish extends Animal
{

}