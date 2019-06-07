import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int firstdig = n1/100;
      int thirddig = n1%10;
      int sum = firstdig + thirddig;
      System.out.println(sum);
      
	}
}