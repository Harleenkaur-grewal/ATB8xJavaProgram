package Sept.ex_25092024;

import java.util.Scanner;
/*
 Table of number n = 10, print table with For or while.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d x %d = %d \n",num ,i ,num*i);
        }
    }
}
