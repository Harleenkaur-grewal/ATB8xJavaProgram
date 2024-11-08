package Oct.ex_18102024;

import java.util.Scanner;

//Reverse the String without using any functions. (for loop)
public class task2 {
    public static void main(String[] args) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String original = sc.nextLine();

        //take an empty string
        String reversed= "";
        int length= original.length();
        for (int i = length - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += original.charAt(i);
        }

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
