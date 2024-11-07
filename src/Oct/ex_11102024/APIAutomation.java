package Oct.ex_11102024;

public class APIAutomation {
    public static void main(String[] args) {
        //calling BasetestAPI DC
        new BaseTestAPI();
        BaseTestAPI base = new BaseTestAPI("Harry",1);
        System.out.println(base.getName());
        base.setName("Raj");
        System.out.println(base.getName());
        base.performGET("abc", 2);
        base.performPOST();
        base.performPUT();
        //calling TestAPI DC
        new TestAPI();
        TestAPI test = new TestAPI("hello",8);
        System.out.println(test.getName());
        test.performGET();
        test.performDELETE();
        //Dynamic Dispatch : a superclass reference can
        // point to subclass objects, enabling polymorphic behavior.
        BaseTestAPI test1 = new TestAPI("Apple",6);
        test1.performPOST();
        test1.performPATCH();
    }
}
