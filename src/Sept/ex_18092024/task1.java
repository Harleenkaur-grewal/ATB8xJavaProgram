package Sept.ex_18092024;
/*
Give some another example of Widening with Implicit
and Explicit, Narrowing with implicit and explicit.
 */
public class task1 {
    public static void main(String[] args) {
         int a = 90;
         long b = a;  // Implicit widening
         System.out.println(b);

         short c = 87;
         float d =(float)c; //Explicit Widening
         System.out.println(d);

         float e = 95.8f;
         System.out.println(e);

         // int f =e; INVALID
        //implicit narrowing not allowed by JVM

         int f = (int) e; // Explicit narrowing with data loss
         System.out.println(f);
    }
}
