package Oct.ex_04102024;

public class Person {
   //Attributes
    String name;
    int age;
    String gender;
    float height;
    float weight;
    String city;
    String occupation;
    long phonenumber;
    String email;
    boolean ismarried;
    //Defaut constructor
    Person(){
        System.out.println("Records of person are as follow: ");
    }
    //Parametrized Constructor 1
    Person(int i){
        System.out.println("Record Entered = "+ i);
    }
    //Parametrized Constructor 2
    Person(String name, int age, String gender,  float height,  float weight, boolean ismarried){
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.height=height;
        this.weight = weight;
        this.ismarried=ismarried;
    }
    //Parametrized Constructor 3
    Person(String name,String city,String occupation,long phonenumber, String email ){
        this.name = name;
        this.city = city;
        this.occupation = occupation;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    // Behavior 1
    void basicdetails()
    {
        System.out.println("Name: "+ name);
        System.out.println("Gender "+ gender);
        System.out.println("Is Married? "+ ismarried);
        System.out.println();
    }
    // Behavior 2
    void otherdetails(){
        System.out.println("Name: "+ name);
        System.out.println("City: "+ city);
        System.out.println("Occupation: "+ occupation);
        System.out.println("PhoneNumber: "+ phonenumber);
        System.out.println("Email: "+ email);
        System.out.println();
    }
    // Behavior 3
    void contactInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phonenumber);
        System.out.println();
    }
    // Behavior 4
    void maritalStatus(){
        System.out.println("Name: " + name);
        System.out.println("Is Married? "+ ismarried);
        System.out.println();
    }
    // Behavior 5
    void occupationDetail(){
        System.out.println("Name: " + name);
        System.out.println("Occupation: "+ occupation);
        System.out.println();
    }
}
