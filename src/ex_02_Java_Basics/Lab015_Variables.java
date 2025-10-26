package ex_02_Java_Basics;

public class Lab015_Variables {
    public static void main(String[] args) {
        // data_type variable_name = variable_value;
        byte age = 65;
        byte _ = 65; //allowed
        byte _123 = 65;
        //byte 123 =65; //not allowed
        //short age = 65; //not allowed using same name
        short age1 = 65;
        age1 =66;
        System.out.println(age1);
        System.out.println(age);
        //System.out.println(_); //not print value
        System.out.println(_123);
    }
}
