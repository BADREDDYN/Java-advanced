package StringBuffer;

public class S_Append {

    public static void main(String[] args) {

        StringBuffer message = new StringBuffer("JAVA");
        System.out.println(message); // JAVA

        message.append(" LANGUAGE");
        System.out.println(message); // JAVA LANGUAGE

        message.insert(5, "PROGRAMMING ");
        System.out.println(message); // JAVA PROGRAMMING LANGUAGE

    }

}
