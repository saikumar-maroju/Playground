import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int first = n/100;
    int second = (n/10)%10;
    int third = n%10;
    int rev = (third*100)+(second*10)+first;
    System.out.println(rev);
  }
}