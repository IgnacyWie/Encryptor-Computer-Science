// import the scanner
import java.util.Scanner;

public class Decryption {

    // This method decrypts the message

    public  void decrypt() {
        int decryptionFactor = 10 - 7;

        int dig_1;
        int dig_2;
        int dig_3;
        int dig_4;
        int dig_5;
        int dig_6;
        int a;
        int temp;
        int decrypted;

        System.out.print("Enter a 6 digit number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        // Extract digits using %
        dig_1 = a % 1000000 / 100000;
        dig_2 = a % 100000 / 10000;
        dig_3 = a % 10000 / 1000;
        dig_4 = a % 1000 / 100;
        dig_5 = a % 100 / 10;
        dig_6 = a % 10;

        // Decrypt the digits
        dig_1 = (dig_1 + decryptionFactor) % 10;
        dig_2 = (dig_2 + decryptionFactor) % 10;
        dig_3 = (dig_3 + decryptionFactor) % 10;
        dig_4 = (dig_4 + decryptionFactor) % 10;
        dig_5 = (dig_5 + decryptionFactor) % 10;
        dig_6 = (dig_6 + decryptionFactor) % 10;

        // Construct Decrypted Number
        decrypted = dig_1 * 100000 + dig_2 * 10000 + dig_3 * 1000 + dig_4 * 100 + dig_5 * 10 + dig_6;
        System.out.print("Decrypted number is: ");
        System.out.println(decrypted);

        // Close the sc
        sc.close();
    }
}