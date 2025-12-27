package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z , a-z, special chars
    //    char c2 = "A"; // "" represents string = Bunch of char
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c7 = '(';
        char c8 = ' '; //blank space

    // Char literals with escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Aditya");
        System.out.println("Aditya"+new_line+"Prakash");
        System.out.println("Aditya\nPrakash");
        System.out.println("Aditya"+tab_line+"Prakash");
        System.out.println("Aditya\tPrakash");
        System.out.println("Aditya"+back_space+"Prakash");
        System.out.println("Aditya\bPrakash");


        char c10 = 'A';
        // ASCII value 65

        char dollar = '$';
        System.out.println(dollar);


    }
}
