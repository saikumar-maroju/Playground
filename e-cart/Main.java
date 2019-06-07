import java.util.Scanner;

class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
    this.product = product;
  }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  public int getQuantity()
  {
    return quantity;
  }
}
class Bill extends Customer
{
  public int result(int p , int q)
  {
    int result = p * q;
    return result;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    Scanner in = new Scanner(System.in);
    String product = in.next();
    int price = in.nextInt();
    int quantity = in.nextInt();
    i.setPrice(price);
    c.setQuantity(quantity);
   int p =  i.getPrice();
   int q =  c.getQuantity();
   int r =  obj.result(p,q);
    System.out.println("Total Price is : " +r); 
  }
}