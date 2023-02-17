package Strings;

public class Strings {

    public static void main(String[] args) {

        String s1 = "JAVA";

        char[] c = {'J', 'A', 'V', 'A'};
        String s2 = new String(c);

        String s3 = new String("JAVA");

        System.out.println(s1); // JAVA
        System.out.println(s2); // JAVA
        System.out.println(s3); // JAVA

    }

}