import java.util.Scanner;

public class EvenOdd
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        if(num%2 ==0)
        {
            System.out.println(num + "Is Even");
        }
        else{
            System.out.println(num + "Is Odd");
        }
        
    }
}