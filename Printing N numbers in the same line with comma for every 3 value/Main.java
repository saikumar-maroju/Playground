import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = 3;
    for ( int num = 1 ; num <= n ; num ++ )
    {
      System.out.print(num);
      if( (num % m == 0) && ( num != n))
        System.out.print(",");
    }
  }
}