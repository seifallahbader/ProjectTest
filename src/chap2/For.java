package chap2;

public class For
    {
        public static void main(String[] args)
        {
            //infinite Loop
            /*for( ; ; )
            {
                System.out.println("Hello World");
            }*/

            int x = 0;
            for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
                System.out.print(y + " ");
            }
            System.out.print(x);
        }
    }
