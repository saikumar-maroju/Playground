import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      System.out.println(square_no(n));
	} 
  public static int square_no( int a)
  {
    int result = a*a;
    return result;
  }
  
}