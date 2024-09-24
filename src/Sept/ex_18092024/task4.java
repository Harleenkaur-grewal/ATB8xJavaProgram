package Sept.ex_18092024;

public class task4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a-- + a--);
        System.out.println(a);
    }
}
/*
output is 27 and 7
line 6 exp a-- =10 and then decrement a by 1 so a=9
       exp a-- = 9 and then decrement a by 1 so a= 8
       exp a-- = 8 and then decrement a by 1 so a= 7
 adding exp= 10+9+8 = 27
 and a=7
 */
