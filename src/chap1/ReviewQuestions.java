package chap1;

/**
 * The type Review questions.
 */
public class ReviewQuestions
    {
        private String brand;
        private boolean empty;
        /**
         * The Num pets.
         */
        short numPets = 5;
        /**
         * The Num grains.
         */
        int numGrains = 56;
        /**
         * The Name.
         */
        String name = "Scruffy";

        /**
         * The entry point of application.
         *
         * @param args the input arguments
         */
        public static void main(String[] args)
        {
            ReviewQuestions wb = new ReviewQuestions();

            System. out .print("Empty = " + wb.empty);
            System. out .print(", Brand = " + wb.brand  + "\n");

            //System. out .print(wb.numPets.length());
            //System. out .print(wb.numGrains.length());
            System. out .print(wb.name.length());
        }
    }
