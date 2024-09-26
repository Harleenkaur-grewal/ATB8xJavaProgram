package Sept.ex_23092024;
/* TASK 1:
Create a simple calculator that performs addition, subtraction, multiplication,
and division, modulus based on user input using switch statements.
*/
public class Task1 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 7;
        char operator = '*';
        switch (operator) {
            case '+':
                int sum = num1 + num2;
                System.out.println("Addition " + sum);
                break;
            case '-':
                int diff = num1 - num2;
                System.out.println("Subtraction " + diff);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println("Multiplication " + mul);
                break;
            case '/':
                float div = (float) num1 / num2;
                System.out.println("Division " + div);
                break;
            case '%':
                int mod = num1 % num2;
                System.out.println("Modulus " + mod);
                break;
            default:
                System.out.println("Wrong Operator");
                break;
        }
    }
}
