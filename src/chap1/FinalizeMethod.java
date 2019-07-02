package chap1;

import java.util.*;
public class FinalizeMethod
{
        protected void finalize()
        {
            System.out.println("Calling finalize");
        }
        public static void main(String[] args)
        {
            FinalizeMethod f = new FinalizeMethod();
        }


        //OR
        private static List objects = new ArrayList();
        protected void FinalizeMethod() {
        objects.add(this); // Don't do this
    }
}
