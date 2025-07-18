package vmmm;
import java.util.Scanner;

public class wrapper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        if (decimal >= 1 && decimal <= 255) {
            // Convert decimal to binary string
            String binary = Integer.toBinaryString(decimal);
            // Pad with leading zeros to make it 8 bits
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println("Binary representation: " + paddedBinary);
        } else {
            System.out.println("Please enter a number between 1 and 255.");
        }

        sc.close();
    }
}