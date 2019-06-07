import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix[][] = new int[row_size][column_size];
    for(int i = 0 ; i < row_size ; i++)
    {
      for(int j=0 ; j < column_size ; j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    int transpose[][] = new int[column_size][row_size];
    for(int i = 0 ; i < row_size ; i++)
    {
      for(int j = 0 ; j < column_size ; j++)
      {
        transpose[j][i] = matrix[i][j];
      }
    }
    for(int i = 0 ; i < column_size ; i++)
    {
      for(int j = 0 ; j <row_size ; j++)
      {
        System.out.print(transpose[i][j]+" ");
      }
      System.out.println();
    }
  }
}