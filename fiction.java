import java.util.*;
abstract class publisher
{
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
           System.out.println("Enter publisher details");
           System.out.println("Publiser name:");
           name=sc.next();
       

   }
}
class book extends publisher
{
    String bname;
    //int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.println("Book name");
        bname=sc.next();
        //System.out.println("Book Id");
        //bid=sc.nextInt();
    }
}
class literature extends book
{
    String chp;
    int chpno;
	int pgno;
    Scanner sc=new Scanner(System.in);
    literature()
    {
        System.out.println("Chapter Name:");
        chp=sc.next();
        System.out.println("Chapter number:");
        chpno=sc.nextInt();
		System.out.println("page number:");
        pgno=sc.nextInt();
    }
}
class fiction extends literature
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void displ()
    {
        System.out.println("Details are:");
        System.out.println("Publisher Name:");
        System.out.println(name);
        System.out.println("Book name:");
        System.out.println(bname);
        //System.out.println("Book Id:");
        //System.out.println(bid);
        System.out.println("Chapter:");
        System.out.println(chp);
        System.out.println("Chapter Number");
        System.out.println(chpno);
		System.out.println("page Number");
        System.out.println(pgno);
        
        System.out.println("Topic:");
        System.out.println(topic);
    }
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].displ();
        }
    }
}