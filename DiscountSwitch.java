import java.util.Scanner;

public class DiscountSwitch
{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the category of product: 'a','b','c','d','e'");
        char A = scanner.next().charAt(0);
        System.out.println("Enter Price of the Product: ");
        double mp = scanner.nextFloat();
        double sp;
        switch(A){
            case('a')->{
                sp = mp - (mp *60/100);
                System.out.println("Your Price is: "+sp);
            }
            case('b')->{
                sp = mp - (mp *40/100);
                System.out.println("Your Price is: "+sp);
            }
            case('c')->{
                sp = mp - (mp *20/100);
                System.out.println("Your Price is: "+sp);
            }
            case('d')->{
                sp = mp - (mp *60/100);
                System.out.println("Your Price is: "+sp);
            }
            default -> System.out.println("Enter a valid choice");
        }
        }
}