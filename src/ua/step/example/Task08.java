package ua.step.example;

/**
 * Проблемы интерфейсов - отсутствие реализации. 
 * Компилятор считает, что Interface3.testMethod() реализовывать 
 * в классе MixedClass3 не надо, так как в
 * родительском классе уже есть метод с такой же сигнатурой.
 */
public class Task08
{
    public static void main(String[] args)
    {
        Interface3 i3 = new MixedClass3();
        i3.testMethod();
    }
}

abstract class ParentClass
{
    public void testMethod()
    {
        System.out.println("testMethod () from parent class");
    }
}

interface Interface3
{
    public void testMethod(); // обязывает классы реализовывать этот метод
}

class MixedClass3 extends ParentClass implements Interface3
{
    // контракт нарушен, а мы этого не знаем
}