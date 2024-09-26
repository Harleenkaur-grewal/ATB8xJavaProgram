package Sept.ex_25092024;

import java.util.Scanner;
// Find a factorial of a number
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int factorial =1;
        for(int i = number; i > 0; i--){
            factorial *= i;
        }
        System.out.printf("Factorial of a number %d is %d",number,factorial);
    }
}
