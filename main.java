// Build menu for encrypting and decrypting

import java.util.Scanner;

public class main {

    public static void printLogo() {
        System.out.println("  _______ _   _ _______ ______ _____  ______ _______ ");
        System.out.println(" |__   __| \\ | |__   __|  ____|  __ \\|  ____|__   __|");
        System.out.println("    | |  |  \\| |  | |  | |__  | |__) | |__     | |   ");
        System.out.println("    | |  | . ` |  | |  |  __| |  _  /|  __|    | |   ");
        System.out.println("    | |  | |\\  |  | |  | |____| | \\ \\| |____   | |   ");
        System.out.println("    |_|  |_| \\_|  |_|  |______|_|  \\_\\______|  |_|   ");
        System.out.println("                                                    ");
    }

    public static void main(String args[]) {
        // Build menu for encrypting and decrypting in while true
        printLogo();

        // Create a scanner
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        // Create a while true loop
        while (running) {
            // Print the menua
            System.out.println("A. Encrypt");
            System.out.println("B. Decrypt");
            System.out.println("C. Exit");
            System.out.print("Enter your choice: ");

            // Change the integer to char
            // Get the choice
            char choice = sc.next().charAt(0);

            // use switch case      
            switch (choice) {
                case 'A':
                    // Encrypt
                    // Create a new encryption object
                    Encryption encryption = new Encryption();

                    // Call the encrypt method
                    encryption.encrypt();
                    break;
                case 'B':
                    // Decrypt
                    // Create a new decryption object
                    Decryption decryption = new Decryption();

                    // Call the decrypt method
                    decryption.decrypt();
                    break;
                case  'C':
                    // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}