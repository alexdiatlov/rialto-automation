package ua.com.rialtotenders.tests;

/**
 * Created by Alexander.
 */
public class SimpleTest {

    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
                "John", "James",
                "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        //for - foreach
        for(int i = 0; i < names.length; i++) {
            //System.out.println("Be index: " + i + " you will find name: " + names[i]);
            if (names[i].equals("Alex")) {
                System.out.println("Alex index is " + i);
                continue;
            } else {
                System.out.println("Not Alex under index " + i);
            }
            System.out.println("JUST TEXT " + i);
        }

        //while
        //until

    }
}
