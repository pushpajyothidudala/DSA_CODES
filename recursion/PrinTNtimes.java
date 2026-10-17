import java.util.*;

public class Main {
	static void printword(int n)
    {
        if(n==1)
		{
			System.out.println("AccioSchool");
			return;
		}
		printword(n-1);
			System.out.println("AccioSchool");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
	    printword(n);
    }
}
