package Sept.ex_27092024;
/*
Create a Java program that prints the first 5 even numbers using a do-while loop.
 */
public class Task2 {
    public static void main(String[] args) {
        int b = 1;
        System.out.println("Printing first five EVEN numbers:");
        do{
            System.out.println(b*2);
            b++;
        }while(b<=5);
    }
}
