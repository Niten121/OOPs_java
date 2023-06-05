import java.util.*;
class Nestingtest
{
    int m,n,l;
    Nestingtest(int x,int y)
    {
        m=x;
        n=y;
    }
 int largest()
 {
    if(m>n)
    {
     return(m);

    }
 else{
     return(n);
     }
 }
void Display()
{
    int large=largest();
    System.out.println("Largest number is "+large);
}
}
 class Nestingtest1
{
        public static void main(String args[])
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int one=sc.nextInt();
        System.out.println("Enter the second number:");
        int two=sc.nextInt();
        Nestingtest p=new Nestingtest(one,two);
        p.Display();
        sc.close();
        }
}