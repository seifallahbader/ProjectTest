package chap1;

public class PrimitiveTypes
{
    boolean bol = true;  //true or false
    byte by= 123 ; // 8-bit integral
    short sh = 16; // 16-bit integral
    int in = 1_000_000; //32-bit integral
    long lon = 122; //64-bit integral
    float flo = 123.45f; //32-bit floating-point
    double dou = 123.456; //64-bit floating-point
    char ch ='a'; //16-bit Unicode value

    public static void main(String[] args) {
        System.out.println(56);    // 56
        System.out.println(0b11); // 3
        System.out.println(017); // 15
        System.out.println(0x1F); // 31
    }
}
