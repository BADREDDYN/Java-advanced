package Strings;

public class Immutable_String {

    public static void main(String[] args) {

        String s1 = "JAVA";
        System.out.println(s1); // JAVA

        s1.concat(" OOP");
        System.out.println(s1); // JAVA

        s1 = s1.concat(" PROGRAMMING LANGUAGE");
        System.out.println(s1); // JAVA PROGRAMMING LANGUAGE

    }
    
}
