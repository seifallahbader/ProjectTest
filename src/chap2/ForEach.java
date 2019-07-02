package chap2;

public class ForEach
    {
        public static void main(String[] args)
        {

            java.util.List<String> names = new java.util.ArrayList<String>();
                names.add("Lisa");
                names.add("Kevin");
                names.add("Roger");
                for(int i=0; i<names.size(); i++)
                {
                    String name = names.get(i);
                    if (i > 0) {
                        System.out.print(" ");
                    }
                    System.out.print("name = "+ name+"\n");
                }

                //example 2
                int[] values = new int[3];
                values[0] = 10;
                values[1] = new Integer(5);
                values[2] = 15;
                for(int i=1; i<values.length; i++)
                {
                    System.out.print(values[i]-values[i-1]);
                }

            System.out.println("\n------------------------------------------------------- \n");
                // exp
            int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
            for(int[] mySimpleArray : myComplexArray) {
                for(int i=0; i<mySimpleArray.length; i++) {
                    System.out.print(mySimpleArray[i]+"\t");
                }
                System.out.println();
            }

        }

    }
