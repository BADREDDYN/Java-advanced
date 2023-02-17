package Strings;

public class ConCat {
    public static void main(String[] args) {

        String s1 = 46 + " JAVA " + 78;
        System.out.println(s1); // 46 JAVA 78

        String s2 = s1.concat(" JAVA");
        System.out.println(s2); // 46 JAVA 78 JAVA

    }

}