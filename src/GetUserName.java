import java.util.Scanner;

public class GetUserName
{
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";

            firstName = Safeinput.getNonZeroLenString(in, "Enter your first name: ");
            lastName = Safeinput.getNonZeroLenString(in, "Enter your last name: ");
            System.out.println("Hello " + firstName + " " + lastName + "!");
        }
    }

