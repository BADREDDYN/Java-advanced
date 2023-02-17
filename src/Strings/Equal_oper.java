package Strings;

public class Equal_oper {

    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "JAVA";
        String s3 = "Java";
        String s4 = new String("JAVA");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s4); // false

        System.out.println(s1.compareTo(s3)); // -32
        System.out.println(s1.compareToIgnoreCase(s3)); // 0

    }

}
