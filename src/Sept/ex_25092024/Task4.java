package Sept.ex_25092024;

import java.util.Scanner;
/*
Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.next();
        int length = name.length();
        int vowels = 0;
        int consonants = 0;
        for (int i =0; i < length; i++) {
            char ch = name.charAt(i);
               if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u'||
                    ch == 'A'|| ch == 'E'|| ch == 'I'||ch == 'O'|| ch == 'U') {
                    vowels++;
               }
               else
                   consonants++;
        }
        System.out.println("Vowels count in given name is " + vowels);
        System.out.println("Consonants count in given name is " + consonants);
    }
}
