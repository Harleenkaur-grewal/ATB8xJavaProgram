package Oct.ex_02092024;

public class task124 {
    public static void main(String[] args) {
        // 5 objects created
        ATBStudent student1 = new ATBStudent(); //object 1
        student1.age= 13;
        student1.name= "NEHA";
        student1.roll = 10;
        student1.city = "Delhi";
        student1.ismale = false;
        student1.display();
        System.out.println();

        ATBStudent student2 = new ATBStudent(); //object 2
        student2.age= 14;
        student2.name= "RAHUL";
        student2.roll = 11;
        student2.city = "Noida";
        student2.ismale = true;
        student2.display();
        System.out.println();

        ATBStudent student3 = new ATBStudent(); //object 3
        student3.age= 13;
        student3.name= "PRIYA";
        student3.roll = 12;
        student3.city = "Gurugram";
        student3.ismale = false;
        student3.display();
        System.out.println();

        ATBStudent student4 = new ATBStudent();//object 4
        student4.age= 14;
        student4.name= "RAJ";
        student4.roll = 13;
        student4.city = "Haryana";
        student4.ismale = true;
        student4.display();
        System.out.println();

        ATBStudent student5 = new ATBStudent();//object 5
        student5.age= 14;
        student5.name= "HARRY";
        student5.roll = 14;
        student5.city = "Punjab";
        student5.ismale = true;
        student5.display();
        System.out.println();
    }
}
