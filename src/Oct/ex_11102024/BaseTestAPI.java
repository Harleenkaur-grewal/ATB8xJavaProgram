package Oct.ex_11102024;

public class BaseTestAPI {
    // Encapsulation implemented by using private keywords
    private String name;
    private int id;

    // Parameterized constructor
    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Default Constructor
    public BaseTestAPI(){
       System.out.println("Base Test DC");
   }
    //getters and setters to access attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //behaviours
    void performGET()
    {
        System.out.println("Performing GET operation");
    }
    //method overloading
    void performGET(String name, int id)
    {
        System.out.println("API Name ="+name+ " Id ="+id);
    }
    void performPOST()
    {
        System.out.println("Performing POST operation");
    }
    void performPATCH()
    {
        System.out.println("Performing PATCH operation");
    }
    void performPUT()
    {
        System.out.println("Performing PUT operation");
    }
    void performDELETE()
    {
        System.out.println("Performing DELETE operation");
    }
}
