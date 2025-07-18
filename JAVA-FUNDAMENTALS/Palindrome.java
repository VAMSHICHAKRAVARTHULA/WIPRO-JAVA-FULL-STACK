import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        int left=0;
        int right =a.length()-1;
        if(a.charAt(left)!=a.charAt(right)){
            System.out.println("not  a palindrome");
            left++;
            right--;
        }else{
            System.out.println("is palindrome");
        }
    }
}