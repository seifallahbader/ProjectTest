package chap1;

/**
 * The type Java primitive types.
 */
public class JavaPrimitiveTypes
    {
        /**
         * The Max.
         */
//long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L;
        /**
         * The Million 1.
         */
        int million1 = 1000000;
        /**
         * The Million 2.
         */
        int million2 = 1_000_000;

        /**
         * The Annoying but legal.
         */
/*double notAtStart = _1000.00; // DOES NOT COMPILE
        double notAtEnd = 1000.00_;  // DOES NOT COMPILE
        double notByDecimal = 1000_.00;      // DOES NOT COMPILE*/
        double annoyingButLegal = 1_00_0.0_0;  // this one compiles

        /**
         * The entry point of application.
         *
         * @param args the input arguments
         */
        public static void main(String[] args)
        {
            System.out.println(Integer.MAX_VALUE);

            //Converting Back to Binary
            System.out.println(56);
            System.out.println(0b11);
            System.out.println(017);
            System.out.println(0x1F);

        }
    }
