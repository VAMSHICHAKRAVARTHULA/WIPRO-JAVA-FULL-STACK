import java.util.Scanner;

class summation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter company name: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter location: ");
        int num2 = scanner.nextInt();
        int  r=num1+num2;

        System.out.println("The sum of "  +num1 + " and " + num2 + "is: " +r );
    }
} 
