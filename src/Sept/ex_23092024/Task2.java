package Sept.ex_23092024;
/* TASK 2:
Write a program that takes an integer input (1-12)
and prints the name of the corresponding month using a switch statement.
*/
public class Task2 {
    public static void main(String[] args) {
        int month = 3;
        switch(month){
            case 1 -> System.out.println("JANUARY");
            case 2 -> System.out.println("FEBRUARY");
            case 3 -> System.out.println("MARCH");
            case 4 -> System.out.println("APRIL");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("Invalid Input");
        }
    }
}
