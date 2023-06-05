import java.util.Scanner;

public class CityGuide {
    public static void main(String[] args) {
        int day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number of your choice:-> ");
        day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Agra");
                break;
            case 2:
                System.out.println("puri");
                break;
            case 3:
                System.out.println("goa");
                break;
            case 4:
                System.out.println("charminar");
                break;
            case 5:
                System.out.println("india gate");
                break;
            case 6:
                System.out.println("Golconda fort");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
