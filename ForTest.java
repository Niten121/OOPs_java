import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n:-> ");
        int two = 1;
        int n = sc.nextInt();
        System.out.println("2 to power n||  n || 2 to -n");
        for (int i = 1; i <= n; i++) {
            two = two * 2;
            System.out.print(two + "\t\t" + i + "\t1/" + two);
            System.out.println();
        }
    }
}