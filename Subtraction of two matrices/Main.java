import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0 ; i < row_size ; i++)
    {
      for(int j = 0 ; j < column_size ; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0 ; i < row_size; i++)
    {
      for(int j = 0 ; j < column_size ; j++)
      {
        matrix2[i][j] = in.nextInt();
      }
    }
    int subtract[][] = new int[row_size][column_size];
    subtraction_matrix(matrix1 , matrix2 , subtract);
    display_matrix(subtract);
  }
  public static void subtraction_matrix(int matrix1[][] , int matrix2[][], int subtract[][])
  {
    for(int i =0 ; i < subtract.length; i++)
    {
      for(int j=0 ; j < subtract[i].length ; j++)
      {
        subtract[i][j] = matrix1[i][j]-matrix2[i][j];
      }
    }
  }
  public static void display_matrix(int matrix[][])
  {
     for(int i =0 ; i < matrix.length; i++)
    {
      for(int j=0 ; j < matrix[i].length ; j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
       System.out.println();
    
  }
}
}
