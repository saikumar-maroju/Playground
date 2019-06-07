import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch(option)
        {
          case 1:
            int side = in.nextInt();
            int area_square = side*side;
            System.out.println(area_square);
            break;
          case 2:
            int length = in.nextInt();
            int breadth = in.nextInt();
            int area_rec = length*breadth;
            System.out.println(area_rec);
            break;
          case 3:
            int height = in.nextInt();
            int base = in.nextInt();
            int area_tri = (height*base)/2;
            System.out.println(area_tri);
            break;
          case 4:
            int radius = in.nextInt();
            double area_cir = 3.14*radius*radius;
            System.out.println(area_cir);
            break;
        } 
    }
}