import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.print("Enter any number to check pime:-> ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not Prime Number ");
        }
    }
}