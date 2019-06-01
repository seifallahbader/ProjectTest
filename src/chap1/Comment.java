package chap1;
/**
 * The type Comment.
 */
public class Comment
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        // comment until end of line
        System.out.println("// comment until end of line");

        /* Multiple * line comment */
        System.out.println("\n/* Multiple * \n line comment */");

        /**
         * Javadoc multiple-line comment
         *  @author SeifAllah
         *  */
        System.out.println("\n/** Javadoc * \n line comment */");

    }
}
