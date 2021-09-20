import java.io.*;
import java.util.*;

class file{
    String fname;
    void getname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
    }
    void write() throws Exception{
        FileOutputStream fos = new FileOutputStream(fname);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("welcome to lab session\nenjoy coding");
    }
    void read() throws Exception{
        FileInputStream fis = new FileInputStream(fname);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
		 System.out.println("****content of the file is****");
        System.out.println(str);
    }
    public static void main(String ...a) throws Exception {
        file f = new file();
        f.getname();
        f.write();
        f.read();
    }
}
