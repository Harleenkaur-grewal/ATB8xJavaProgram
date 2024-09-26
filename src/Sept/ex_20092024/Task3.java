package Sept.ex_20092024;
/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side3
 */
public class Task3 {
    public static void main(String[] args) {
       int side_1 = 15;
       int side_2 = 45;
       int side_3 = 15;
       // if all sides are equal
       if (side_1 == side_2 && side_2 == side_3)
       {
           System.out.println("Triangle is EQUILATERAL");
       }
       // if any two sides are equal
       else if (side_1 == side_2 || side_2 == side_3 || side_1 == side_3)
        {
            System.out.println("Triangle is ISOSCELES");
        }
       //none side is equal
       else
       {
           System.out.println("Triangle is SCALENE");
       }
    }
}
