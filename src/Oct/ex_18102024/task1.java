package Oct.ex_18102024;

import java.util.Scanner;

/* Calculate the length of the String - without using the length() function.
String name =”Pramod”; →  6 , CharArray, for loop*/
public class task1 {
    public static void main(String[] args) {
        //Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = sc.nextLine();

        // Convert the String to a character array
        char[] charArray = s1.toCharArray();
        int length= charArray.length;
        int count =0;

        for(int i=0;i<length;i++){
             count++;
        }

        System.out.println("Input String: "+ s1);
        System.out.println("Length of the string is "+count);
    }
}
