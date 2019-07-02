package chap2;

public class While
    {
        public static void main(String[] args)
        {
            //infinite loop
            int x = 100;
            int y = 5;
            while(x < 10)
            {
                y++;
                System.out.println("y = "+ y);
            }

            if(x > 10) {
                do {
                    x--;
                    System.out.println("x = "+x);
                } while(x > 10);
            }


            System.out.println("-----------------------");

            int v = 20;
            while(v>0) {
                do {
                    v -= 2;
                } while (v>5);
                v--;
                System.out.print(v+"\t");
            }

        }
    }
