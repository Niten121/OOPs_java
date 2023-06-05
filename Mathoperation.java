public class Mathoperation {
    static void mul(int a, int b) {
        System.out.println("Multiply =" + a * b);
    }

    static void div(int a, int b) {
        System.out.println("Division = " + a / b);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        mul(a, b);
        div(a, b);
    }
}
