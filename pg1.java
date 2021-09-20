import java.util.*;

class rectarea extends Thread {
    int l, b, h;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        l = sc.nextInt();
        System.out.println("Enter breath:");
        b = sc.nextInt();
        System.out.println("Area of rectangle:"+l * b);
    }

}
class sqrarea extends Thread{
int l;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        l = sc.nextInt();
        System.out.println("Area of square="+l * l);
    }

}
class triarea implements Runnable {
    int l, b, h;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        b = sc.nextInt();
        System.out.println("Enter height:");
        h = sc.nextInt();
        System.out.println("Area of triangle="+0.5f * b * h);
    }

}
class cirarea implements Runnable{
    int l;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        l = sc.nextInt();
        System.out.println("Area of circle="+3.14f * l);
    }

}

public class pg1 {
    public static void main(String ...a)throws Exception{
        Scanner sc = new Scanner(System.in);
        rectarea t1 = new rectarea();
        sqrarea t2 = new sqrarea();
        triarea r1 = new triarea();
        cirarea r2 = new cirarea();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        int c;
        do{
            System.out.println("\n1.Area of rectangle\t2.Area of square\n3.Area of triangle\t4.Area of circle\n5.Exit\noption:");
            c = sc.nextInt();
            switch (c){
                case 1:t1.start();
                t1.join();
                break;
                case 2:t2.start();
                t2.join();
                break;
                case 3:t3.start();
                t3.join();
                break;
                case 4:t4.start();
                t4.join();
                break;
                case 5:System.exit(0);
                break;
                default:System.out.println("Invalid");
                break;
            }
        }while (c!=5);
    }
}