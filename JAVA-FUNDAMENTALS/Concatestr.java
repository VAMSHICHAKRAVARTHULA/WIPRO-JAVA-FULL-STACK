import java.util.Scanner;
class Concatestr{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first string:");
        String a = scanner.nextLine();
        System.out.println("enter the second string:");
        String b = scanner.nextLine();
        String r=a.concat(b);
        String r1=r.toLowerCase();
        System.out.println(r1);
    }
}