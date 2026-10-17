import java.io.*;
import java.util.*;
public class Main {
  public static void multiplyRecursively(int n, int m) {
    System.out.println(mul(n,m));
  }
  static long mul(int n,int m)
  {
    if(m==0) return 0;
    return n+mul(n,m-1);
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    multiplyRecursively(n, m);
  }
}