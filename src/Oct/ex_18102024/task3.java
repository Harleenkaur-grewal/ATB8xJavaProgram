package Oct.ex_18102024;

import java.util.Scanner;
//A program to check Palindrome for a string
public class task3 {
    public static void main(String[] args) {
        //Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();
        //take an empty string
        String s2= "";
        int length= s1.length();

        for (int i = length - 1; i >= 0; i--) {
            // Append each character to the reversed string
            s2 += s1.charAt(i);
        }

        System.out.println("Input String: "+ s1);
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }
}
