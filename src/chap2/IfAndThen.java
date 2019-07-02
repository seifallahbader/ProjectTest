package chap2;

public class IfAndThen
    {
        static int hourOfDay = 16;
        public static void main(String[] args)
        {
            if(hourOfDay < 15)
            {
                System.out.println("Good Afternoon");
            } else if(hourOfDay < 11)
            {
                System.out.println("Good Morning");
            } else
            {
                System.out.println("Good Evening");
            }

            //example BooleanExpression ? expression 1 : expression2
            int y = 6;
            final int x;
            x = (y > 5) ? (2 * y) : (3 * y);
            System.out.println(x);
        }
    }
