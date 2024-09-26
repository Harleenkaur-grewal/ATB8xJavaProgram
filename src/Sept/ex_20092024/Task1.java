package Sept.ex_20092024;
/*
By using Ternary Operators max between 3 numbers.
Input int - a,b,c - a = 10, b = 20, c = 45
Max → a,b,c → c
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a>b) ? ( a>c ? a : c): ( b>c ? b: c);
        System.out.printf("Maximum of %d, %d and %d is %d ",a,b,c,max);
    }
}
