package chap1;

/**
 * The type Java building blocks.
 */
public class JavaBuildingBlocks
{
    private int numberEggs;// instance variable  public static void main(String[] args)

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        {
            JavaBuildingBlocks mother = new JavaBuildingBlocks();
            mother.numberEggs = 1;    // set variable
            System.out.println(mother.numberEggs);  // read variable


            String first = "Theodore";
            String last = "Moose";
            String full = first + last;

            System.out.println(full);
        }
       /* public static void main(String[] args)
            {
                System.out.println(args[0]);
                System.out.println(args[1]);

            }

            //$ javac JavaBuildingBlocks.java
            //$ java JavaBuildingBlocks Bronx test2*/
    }

}
