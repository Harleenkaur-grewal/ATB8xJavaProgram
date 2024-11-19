package Nov.ex_04112024;

import java.util.ArrayList;
import java.util.Collections;

/*
How do you reverse an ArrayList in Java?
 */
public class Task1_reverse {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(81);
        array.add(19);
        array.add(17);
        System.out.println(array);
        Collections.reverse(array);
        System.out.println(array);

        //Another Way
        // Create a new ArrayList to store reversed elements
        ArrayList reversedList = new ArrayList();
        for (int i = array.size() - 1; i >= 0; i--) {
            reversedList.add(array.get(i));
        }

        System.out.println("Reversed List: " + reversedList);
    }
}
