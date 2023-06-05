public class NestedTry {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            try {
                int b = Integer.parseInt(args[1]);
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Divide by 0 error!!!");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Need 2 parameters");
        }
    }
}
