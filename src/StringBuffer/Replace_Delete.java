package StringBuffer;

public class Replace_Delete {

    public static void main(String[] args) {

        StringBuffer message = new StringBuffer("JAVA PROGRAMMING LANGUAGE");

        System.out.println(message); // JAVA PROGRAMMING LANGUAGE

        message.replace(0, 4, "KOTLIN");
        System.out.println(message);  // KOTLIN PROGRAMMING LANGUAGE

        message.delete(6, 18);
        System.out.println(message);  // KOTLIN LANGUAGE

        message.reverse();
        System.out.println(message); // EGAUGNAL NILTOK

    }

}
