package Sept.ex_18092024;

public class task3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
/*
output is 28 and 9
line 6 exp --a = 9
       exp a++ = 9 amd then increment a by 1 so a=10
       exp a-- = 10 and then decrement a by 1 so a = 9
       adding exp = 9+9+10 = 28
       and a=9
 */
