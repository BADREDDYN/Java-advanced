package Strings;

public class Compare {
    public static void main(String[] args) {

        String s1 = new String("JAVA");
        String s2 = "JAVA";

        System.out.println(s1.equals(s2)); // true

        s2 = "Java";
        System.out.println(s1.equalsIgnoreCase(s2)); // true

    }

}