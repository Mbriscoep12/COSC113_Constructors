public class Student {
    //Attributes
    String FN;
    String LN;
    int SID;

    //Methods can be static and non-static.
    //This method returns nothing - void

    //Method name - main
    //JVM access the static method using ClassName.MethodNa,e
    //JVM executes Student.main


    //If constructors aren't defined, JVM will provide a default constructor.
    //Constructors don't have a return type
    //Constructors must have the same name as the class name.
    Student(){
        FN="John";
        LN= "Jonas";
        SID = 111;

    }

    Student(String FN, String LN, int SID){
        this.FN = FN;
        this.LN= LN;
        this.SID= SID;
    }
    public static void main(String[] args){


    //Creates reference value for class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("Bukumi","Jake",111);

        IO.println("First name is: " + s3.FN);
        IO.println("Last name is: " + s3.LN);
       IO.println("The Student ID is: " + s3.SID);

    //To select attributes use "."
//        IO.println("First name is: " + s1.FN);
//        IO.println("Last name is: " + s1.LN);
//        IO.println("The Student ID is: " + s1.SID);




        System.out.println("Hello Constructors");
    }

}
