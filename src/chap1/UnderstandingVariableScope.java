package chap1;

public class UnderstandingVariableScope
{
    static int MAX_LENGTH = 5;
    int length;


    public void eatIfHungry(boolean hungry)
    {
        if (hungry)
        {
             int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
            System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }

    public void eatIfHungry(boolean hungry)
    {
        if (hungry)
        {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
            System.out.println(teenyBit); // DOES NOT COMPILE
    }


    public void eatMore(boolean hungry, int amountOfFood)
    {
        int roomInBelly = 5;
        if (hungry)
        {
            boolean timeToEat = true;
            while (amountOfFood > 0)
            {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

    public void grow(int inches)
    {
        if (length < MAX_LENGTH)
        {
            int newSize = length + inches;
            length = newSize;
        }
    }
}