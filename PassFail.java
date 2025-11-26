import java.util.Scanner;

public class PassFail
{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double marks;
        System.out.println("Enter your marks: ");
        marks = scanner.nextDouble();
        String IsPass = (marks>=35)? "You passed" : "You failed";
        System.out.println(IsPass);
    }
}