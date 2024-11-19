package Oct.ex_28102024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Collection_Arraylist {
    public static void main(String[] args) {
        ArrayList studentList = new ArrayList();
        studentList.add("Harry");
        studentList.add("Kaur");
        studentList.add("Harry"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);
        studentList.add(3445);
        studentList.add("&&&&");

        System.out.println(studentList);

        //  List list  = new List()
        List list = List.of("banana", "apple", "orange", "grapes", "orange");
        System.out.println(list);
        System.out.println(list.size());
        //list.add("guava"); // UnsupportedOperationException
        System.out.println(list.isEmpty());
//        System.out.println(list.contains(1)); - //false
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("orange")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("orange")); //find the first occ of element in list

        System.out.println(" ------ default for loop ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(" ------ for each loop ");


        for (Object o : list) {
            System.out.println(o);
        }


        List marks = new ArrayList();
       /* marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);*/
        marks.add("abc");
        marks.add("xyz");
        marks.add("hjk");
        System.out.println(marks);
        //  Sorting
      //  Collections.sort(marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Dutta"));

        System.out.println(" --- ");

        System.out.println(s);

        s.add(0,"Lucky");
        System.out.println(s);
        // s.remove()
        System.out.println(s.get(0));


    }
}
