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

    public static void main(String[] args){

    //If constructors aren't defined, JVM will provide a default constructor.
    //Creates reference value for class
        Student s1 = new Student();

    //To select attributes use "."
        IO.println("First name is: " + s1.FN);
        IO.println("Last name is: " + s1.LN);
        IO.println("The Student ID is: " + s1.SID);




        System.out.println("Hello Constructors");
    }

}
