package Sept.ex_13092024;
/*
Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs.
 */
public class Task2 {
    public static void main(String[] args) {
        double a =93;
        double b =67;
        System.out.printf("Addition of two numbers %.2f and %.2f is %.2f  \n", a,b, a+b);
        System.out.printf("Subtraction of two numbers %.2f and %.2f is %.2f  \n", a,b, a-b);
        System.out.printf("Multiplication of two numbers %.2f and %.2f is %.2f  \n", a,b, a*b);
        System.out.printf("Division of two numbers %.2f and %.2f is %.2f  \n", a,b, a/b);
        System.out.printf("Modulus of two numbers %.2f and %.2f is %.2f  \n", a,b, a%b);
    }
}

