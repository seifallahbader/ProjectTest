package chap1;

/**
 *       test javaDoc
*/

/**
 * The type Salmon.
 */
public class Salmon
    {
        /**
         * The Count.
         */
        int count;

        /**
         * Salmon.
         */
        public void Salmon()
        {
            count = 4;
        }

        /**
         * The entry point of application.
         *
         * @param args the input arguments
         */
        public static void main(String[] args)
            {
                Salmon s = new Salmon();
                System. out .println(s.count);
             }
    }

