package chap1;

public class ReadingAndWritingObjectFields
{
    int numberEggs;// instance variable
    public static void main(String[] args) {
        ReadingAndWritingObjectFields mother = new ReadingAndWritingObjectFields();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable


        System.out.println(" Example 2 \n");

        String first = "Theodore";
        String last = "Moose";
        String full = first + last;

        System.out.println(" full ");

    }
}
