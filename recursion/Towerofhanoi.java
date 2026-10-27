import java.util.Scanner;

public class Main {
    static void t(int n,char source,char helper,char dest)
    {
        if(n==1) {
            System.out.println("Moving ring"+ " "+ n +" "+"from "+source+" " +"to "+dest);
            return;
        }
        t(n-1,source,dest,helper);
        System.out.println("Moving ring"+ " "+ n +" "+"from "+source+" " +"to "+dest);
        t(n-1,helper,source,dest);
    }

    static void towersOfHanoi(int n, char source, char dest) {
       t(n,source,'C',dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, 'A', 'B'); // move n disks from A to B
    }
}
