import java.nio.ByteBuffer;
import java.util.Scanner;

public class WhileString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = '!';
        StringBuffer sb = new StringBuffer();
        while (true) {
            System.out.print("Enter 1 character:-> ");
            ch = sc.next().charAt(0);
            if (ch == '1')
                break;
            sb.append(ch);

        }
        System.out.println("After appending : " + sb);
    }
}