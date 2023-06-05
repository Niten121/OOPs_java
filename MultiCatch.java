public class MultiCatch {
    public static void main(String[] args) {
        try {
            int den = Integer.parseInt(args[0]);
            System.out.println(3 / den);
        } catch (ArithmeticException e) {
            System.out.println("Divisor was 0");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Missing Argument");
        }
        System.out.println("After Exception");
    }
}
