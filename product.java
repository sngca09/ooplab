import java.util.Scanner;
public class product
{
 int pcode,price;
 String pname=""; 
void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the product code:");
 pcode=sc.nextInt();
 System.out.println("Enter the product name:");
 pname=sc.next();
 System.out.println("Enter the product price:");
 price=sc.nextInt();
}
void disp()
{
 System.out.println("\n\t\tPRODUCT DETAILS");
 System.out.println("\t\t---------------\n");
 System.out.println("Product Code"+pcode);
 System.out.println("Product Name:"+pname);
 System.out.println("Product Price:"+price);
 }
 public static void main(String args[])
{
 product p1=new product();
 product p2=new product();
 product p3=new product();
System.out.println("Enter the first product details:\n");
 p1.read();
System.out.println("Enter the second product details:\n");
 p2.read();
System.out.println("Enter the third product details:\n");
 p3.read();
if(p1.price<p2.price && p1.price<p3.price)
{
     System.out.println("\n "+p1.price+" is smallest price");
     p1.disp();
   }
else if(p2.price<p3.price)
{
   System.out.println("\n "+p2.price+" is smallest price");
   p2.disp();
 }
else 
 {
   System.out.println("\n "+p3.price+" is smallest price");
   p3.disp();
  }
 }
}
/*op
Enter the first product details:

Enter the product code:
1
Enter the product name:
laptop
Enter the product price:
55000
Enter the second product details:

Enter the product code:
2
Enter the product name:
pen
Enter the product price:
400
Enter the third product details:

Enter the product code:
3
Enter the product name:
pencil
Enter the product price:
2

 2 is smallest price

                PRODUCT DETAILS
                ---------------

Product Code3
Product Name:pencil
Product Price:2    */