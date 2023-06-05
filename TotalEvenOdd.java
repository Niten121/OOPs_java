import java.util.Scanner;

public class TotalEvenOdd {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        int[] arr = { 10, 20, 4, 5, 67, 89, 35, 65, 78, 98, 93 };
        System.out.println("Array Elements:-> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println();
        System.out.println("Total even:-> " + even + " Total odd:-> " + odd);

    }
}

