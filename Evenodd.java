import java.io.*;
import java.util.*;

class Readnum{
    int a[] = new int[100];
    String fname;
	
    void getname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
		System.out.println("write 10 integers to the file:");
        for (int i = 0;i<10;i++){
            a[i] = sc.nextInt();
        }
    }
	
    void writefile() throws Exception{
        Scanner sc = new Scanner(System.in);
        PrintWriter wr = new PrintWriter(new FileWriter(fname));
        for (int i=0;i<10;i++){
                wr.write(a[i]+"\n"+"");

        }
        wr.close();
    }
	
    void readfile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fname));
        PrintWriter wr = new PrintWriter(new FileWriter("even.text"));
        PrintWriter wr1 = new PrintWriter(new FileWriter("odd.text"));
        String st;
        while ((st = br.readLine()) != null) {

            int x = Integer.parseInt(st);
            if(x%2==0)
            {
                wr.write(x+"\n"+"");
            }
            else
            {
                wr1.write(x+"\n"+"");
            }
        }
        wr.close();
        wr1.close();
    }
	
    void even() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("even.text"));
        System.out.println("Even");
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
	
    void odd() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("odd.text"));
        System.out.println("Odd");
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}

public class Evenodd{
    public static void main(String ...a) throws Exception {
        Readnum r = new Readnum();
        r.getname();
        r.writefile();
        r.readfile();
        r.even();
        r.odd();
    }
}