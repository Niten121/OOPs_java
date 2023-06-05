public class tcs_EnhanchedforLoop {
    public static void main(String[] args) {
        int []numbers = new int []{1,23,4,5,6};
        //for(int i = 0 ;i <numbers; i++){}
        for(int i :numbers) {
            System.out.println(i);

        }
    }
}
