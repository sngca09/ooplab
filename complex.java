import java.util.*;
class complex
{
	double x,y;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex c=new complex();
	complex c1=new complex();
	System.out.println("Complex number a:");
	c.x=sc.nextDouble();
	c.y=sc.nextDouble();
	System.out.println("Complex number b:");
	c1.x=sc.nextDouble();
	c1.y=sc.nextDouble();
	double smx=c1.x+c.x;
	double smy=c1.y+c.y;
	System.out.println("Sum:"+smx+"+"+smy+"i");
}
}
/*op
Complex number a:
2
9
Complex number b:
3
4
Sum:5.0+13.0i */