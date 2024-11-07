package Oct.ex_11102024;

public class TestAPI extends BaseTestAPI{
    //parameterized constructor
    public TestAPI(String name, int id) {
        super(name, id);
        // super keyword in Java is a reference variable that allows
        // a sub class (child class to reference the parent class).
        System.out.println("TestCaseAPI: Called parent Constructor");
    }
    public TestAPI(){
        //calling Basetest DC
       // super();
        System.out.println("TestAPI DC");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void performGET() {
        super.performGET();
    }

    @Override
    void performPOST() {
        System.out.println("POST Operation overridden in test");
    }

    @Override
    void performDELETE() {
        System.out.println("Delete Operation overridden in test");
    }
}
