import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int row = in.nextInt();
       int column = in.nextInt();
      for(int index1=1; index1 <= row; index1++)
      {
        for(int index2=column; index2>column-index1;index2--)
        {
          System.out.print(index2);
        }
        for(int index2 = 1; index2 <= column-index1; index2++)
        {
          System.out.print(row-index1+1);
        }
        System.out.println();
    }
}}