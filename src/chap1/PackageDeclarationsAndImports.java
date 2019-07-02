package chap1;

//import java.util.Random; // import tells us where to find Random
//import java.util.*; // imports java.util.Random among other things

public class PackageDeclarationsAndImports {

    public static void main(String[] args) {
        Random r = new Random(); // DOES NOT COMPILE without Import
        System.out.println(r.nextInt(10));

    }

}
