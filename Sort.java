public class Sort {
    public static void main(String[] args) {
        int num[] = { 55, 40, 80, 65, 71 };
        int n = num.length;
        int i;
        System.out.println("Number in array is:-> ");
        for (i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("\nAfter sorting array is:->");
        for (i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}