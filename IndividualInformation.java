import java.util.Scanner;

public class IndividualInformation {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for individual's information
        String firstName;
        String lastName;
        String streetAddress;
        String city;
        String zipCode;

        // Input individual's information
        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Street Address: ");
        streetAddress = scanner.nextLine();

        System.out.print("Enter City: ");
        city = scanner.nextLine();

        System.out.print("Enter Zip Code: ");
        zipCode = scanner.nextLine();

        // Output individual's information
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);

        // Close the scanner
        scanner.close();
    }
}
