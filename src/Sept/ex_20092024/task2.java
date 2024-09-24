package Sept.ex_20092024;
/*
Ternary Operators to handle multiple conditions.
Input → int score = 85
String grade →
score >= 90 → A
score >= 80 → B
score >= 70 → C
 */
public class task2 {
    public static void main(String[] args) {
        int score = 85;
        String grade = score>=90 ? "A":(score>=80 ? "B": (score>=70 ? "C" :(score>=60 ? "D" :"E")));
        System.out.println("Grade of student is "+ grade);
    }
}
