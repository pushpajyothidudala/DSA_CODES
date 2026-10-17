import java.util.*;
import static java.lang.Math.ceil;

public class Main {
    static long getfib(long n)
    {
        long a=1;
        long b=1;
        long ans=0;
        for(int i=3;i<=n;i++)
        {
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans%1000000007;
    }
   
	static long NthEvenFibonacci(long n) {
           return getfib(n*3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
    }
}