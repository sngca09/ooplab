import java.util.*;

class student {
    int mark,rollno;
    String name,clsname;
    Scanner sc = new Scanner(System.in);
   void student()
   {
       System.out.println("Name:");
       name= sc.next();
       System.out.println("Roll no:");
       rollno=sc.nextInt();
       System.out.println("class name:");
       clsname=sc.next();
       System.out.println("Enter marks out of 100:");
       mark=sc.nextInt();
   }

}
class sports extends student{
    Scanner sc = new Scanner(System.in);
    int mark1;
    void sprt()
    {
        System.out.println("Enter marks out of 40:");
        mark1=sc.nextInt();
    }
}

class result extends sports
{
    void display()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+rollno);
        System.out.println("Class Name:"+clsname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+mark1);
    }
	    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        result res[]=new result[n];
        for (int i=0;i<n;i++)
        {
            res[i]=new result();
            res[i].student();
            res[i].sprt();
            res[i].display();
        }
    }
}