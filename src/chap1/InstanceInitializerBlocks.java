package chap1;

public class InstanceInitializerBlocks
{
    private String name = "Fluffy";
    {
            System.out.println("setting field");
    }
    public Chick()
    {
            name = "Tiny";
            System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        InstanceInitializerBlocks chick = new InstanceInitializerBlocks();
            System.out.println(chick.name); } }
}
