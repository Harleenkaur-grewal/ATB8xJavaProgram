package Oct.ex_04102024;
/* Create a Person Class with 10 Attributes, 5 Behavr( All types of Methods)
 and use the DC and PC to set the values, Create 5 Objects.
 */
public class taskperson {
    public static void main(String[] args) {
        //default constructor
        new Person();                       //object 1
        //using parametrized constructor 1
        //Person person1 =
        new Person(1);  //object 2
        //using parametrized constructor 2
        Person FirstEntry = new Person("PRIYA",35,"Female",5.5F, 65,true);
        //object 3
        FirstEntry.basicdetails();
        FirstEntry.city ="Noida";
        FirstEntry.occupation ="Teacher";
        FirstEntry.phonenumber =3456124577l;
        FirstEntry.email = "priya@hotmail.com";
        FirstEntry.otherdetails();

        //using parametrized constructor 3
       // Person person2 =
         new Person(2);   //object 4
        //using parametrized constructor 4
        Person SecondEntry_Basic = new Person("Rahul", 40, "Male",6.2F, 70, true);
        //object 5
        SecondEntry_Basic.basicdetails();
        //using parametrized constructor 5
        Person SecondEntry = new Person("Rahul","Delhi","Engineer",
                123456789l, "rahul@gmail.com");   //object 6
        SecondEntry.otherdetails();

        new Person(3);
        Person ThirdEntry_basic = new Person("Harry",32,"Female",5.5F, 62,false);
        ThirdEntry_basic.basicdetails();
        Person ThirdEntry = new Person("Harry","Ludhiana","Engineer",
                2356887617l, "Harry@gmail.com");
        ThirdEntry.otherdetails();

        FirstEntry.contactInfo();
        SecondEntry.contactInfo();
        ThirdEntry.contactInfo();
        FirstEntry.maritalStatus();
        SecondEntry_Basic.maritalStatus();
        ThirdEntry_basic.maritalStatus();
        FirstEntry.occupationDetail();
        SecondEntry.occupationDetail();
        ThirdEntry.occupationDetail();

    }
}
