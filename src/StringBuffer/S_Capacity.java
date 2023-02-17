package StringBuffer;

public class S_Capacity {

    public static void main(String[] args) {

        StringBuffer message1 = new StringBuffer();
        System.out.println("Length: " + message1.length()); // Length: 0
        System.out.println("Capacity: " + message1.capacity() + "\n"); // Capacity: 16

        StringBuffer message2 = new StringBuffer("JAVA");
        System.out.println("Length: " + message2.length()); // Length: 4
        System.out.println("Capacity: " + message2.capacity() + "\n"); // Capacity: 20

    }

}
