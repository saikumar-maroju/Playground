import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
      for( int idx = 0 ; idx < arr_size ; idx ++)
      {
        arr[idx] = in.nextInt();
      }
      zeroes_at_the_end(arr_size , arr);
      for( int idx = 0 ; idx < arr_size ; idx++)
      {
        System.out.print(arr[idx]+" ");
      }
    }
  public static void zeroes_at_the_end(int arr_size , int arr[])
  {
     int count = 0 ;
    for( int idx = 0 ; idx < arr_size ; idx ++)
    {
      if(arr[idx] != 0)
      {
        int temp = arr[idx];
        arr[idx] = arr[count];
        arr[count] = temp;
        count++;
      }
    }
  }
}
      
