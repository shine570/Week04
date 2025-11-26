import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        if(num ==0){
            System.out.printf("%d is 0\n", num);
        }
        else if(num>0){
            System.out.printf("%d is Positive\n",num);
        }
        else{
            System.out.printf("%d is Negative\n",num);
        }
    }
}