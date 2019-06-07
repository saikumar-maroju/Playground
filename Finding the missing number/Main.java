import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
         int n =in.nextInt();
         int arr[] = new int[n];
      for(int idx = 0 ; idx < n ; idx ++)
      {
        arr[idx] = in.nextInt();
      }
      int miss_val = 0;
      for(int val = 1 ; val <= n-1; val++)
      {
        boolean isfound = false;
        for(int idx = 0 ; idx<=n-1; idx++)
        {
          if(arr[idx] == val)
          {
            isfound = true;
            break;
          }
        }
        if(isfound == false)
        {
          miss_val = val;
          break;
        }
      }
      System.out.print(miss_val);
    }
    }
