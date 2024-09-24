package Sept.ex_20092024;
/*
Leap Year Program - Find for 2024
 */
public class task5 {
    public static void main(String[] args) {
        int year =2024;
        /* Leap year condition:
         1. If the year is divisible by 4 and not divisible by 100, or
         2. If the year is divisible by 400.
        */
        if(year %400 == 0 || (year %100 !=0 && year %4 == 0))
            System.out.println(year +" is LEAP Year");
        else
            System.out.println(year +" is NOT a LEAP Year");
    }
}
