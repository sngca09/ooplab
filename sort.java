import java.util.*;

class sort{
    String[] a = new String[200];
    int l;
    void getStr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        l = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i< l;i++){
            a[i] = sc.next();
        }
    }
    void sortString(){
        for (int i=0;i<l-1;i++){
            for (int j=i+1;j<l;j++){
                if(a[i].compareTo(a[j])>0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    void display(){
        System.out.println("Ascending order:");
        for (int i=0;i< l;i++){
            System.out.println(a[i]);
        }
        System.out.println("\nDescending order:");
        for (int i=l-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String ...a){
        sort s = new sort();
        s.getStr();
        s.sortString();
        s.display();
    }
}