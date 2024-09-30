package Sept.ex_27092024;
/*
Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
 */
public class Task3 {
    public static void main(String[] args) {
        int num= 0;
        int count =1;
        while(count<=100){
          num+=count;
          count++;
      }
        System.out.println("The sum of numbers from 1 to 100 is: " + num);
    }
}


