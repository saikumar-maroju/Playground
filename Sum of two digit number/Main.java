import java.util.*;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int firstdig = n1/10;
      int seconddig = n1%10;
      int sum = firstdig + seconddig;
      System.out.println(sum);
		// Type your code here
	}
}