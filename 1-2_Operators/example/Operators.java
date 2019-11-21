package example;

public class Operators extends Object
{
    public static void main(String[] arguments)
    {
        Integer aNumber = 2;
        Integer anotherNumber = 4;

        System.out.println(aNumber + "+" + anotherNumber + "=" + (aNumber + anotherNumber));
        System.out.println(aNumber + "-" + anotherNumber + "=" + (aNumber - anotherNumber));
        System.out.println(aNumber + "*" + anotherNumber + "=" + (aNumber * anotherNumber));
        System.out.println(aNumber + "/" + anotherNumber + "=" + (aNumber / anotherNumber));
        System.out.println(aNumber + "%" + anotherNumber + "=" + (aNumber % anotherNumber));

    }
}
