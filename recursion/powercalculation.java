import java.util.*;

class Main {
	public static long xPowerN(int x, int n)
	{
		if(n==1) return x;
        long ans=x*xPowerN(x,n-1);
		return ans;
	}
	public static void main(String[] args)
	{
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int n = sc.nextInt();
		System.out.println(xPowerN(x, n));
	}
}
