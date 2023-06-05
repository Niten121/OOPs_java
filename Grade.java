import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:-> ");
        int num=sc.nextInt();
        if (num <= 40) {
            System.out.println("Grade D");
        } else if (num <= 60) {
            System.out.println("Grade C");
        } else if (num <= 80) {
            System.out.println("Grade B");
        } else if (num <= 100) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
