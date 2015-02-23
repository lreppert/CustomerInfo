/**
 * Created by Mike on 2/19/2015.
 */



import java.util.Scanner;
import java.util.ArrayList;
public class CustomerInfo {
    public static Scanner scan = new Scanner(System.in);
    public static int selected;
    final static int ONE = 1;
    final static int TWO = 2;
    final static int THREE = 3;
    public static String phoneNumber, firstName, lastName;

    public static void main(String[] args) {
        ArrayList<Info> contact = new ArrayList<>();
        Info personal = new Info();

        personal.setFirstName("Bill ");
        personal.setSurName("Gates  ");
        personal.setTheNumber("(111)-222-3333");
        contact.add(personal);

        personal = new Info();

        personal.setFirstName("Larry ");
        personal.setSurName("Ellison  ");
        personal.setTheNumber("(444)-555-6666");
        contact.add(personal);

        personal = new Info();

        personal.setFirstName("Steve ");
        personal.setSurName("Jobs  ");
        personal.setTheNumber("(777)-888-9999");
        contact.add(personal);

        do {
            System.out.println();
            menu();
            selection();

            if (selected > THREE || selected < ONE) {
                System.out.println("Please select option  1, 2, or 3");
                selection();
            } else if (selected == ONE) {


                System.out.println("Name          " + "  " + "    Phone              ");
                System.out.printf("---------------" + "  " + "   -----------------%n");

                for (final Info info : contact)
                    System.out.printf("%-20s%-15s\n", info.getTheName(), info.getNumber());

            } else if (selected == TWO) {

                System.out.println("Enter First Name:");
                firstName = scan.next();
                System.out.println("Enter Last Name:");

                lastName = scan.next();
                System.out.println("Enter Phone Number and Enclose area code in () :");
                phoneNumber = scan.next();

                personal = new Info();
                personal.setFirstName(firstName);
                personal.setSurName(lastName);
                personal.setTheNumber(phoneNumber);
                contact.add(personal);
            } else if (selected == THREE) {
                System.out.println("GoodBye!");
                return;
            }

        } while (selected != THREE);


    }
    public static void menu() {
        System.out.println("1 - List entries");
        System.out.println("2 - Add entry");
        System.out.println("3 - Exit");

    }

    public static int selection() {

        System.out.println('\n');
        System.out.println("Enter menu number:");
        selected = scan.nextInt();
        return selected;

    }

}






