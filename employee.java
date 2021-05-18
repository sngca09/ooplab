import java.util.Scanner;

public class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] emp=new employee[3];
		System.out.println("Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the employee number,salary,name of the employee:");
			emp[i]=new employee();
			emp[i].eno=sc.nextInt();
			emp[i].esalary=sc.nextInt();
			emp[i].ename=sc.next();
		}
		System.out.println("Enter the eno:");
		int eno1=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(emp[i].eno==eno1)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found");
			}
		}


	}

}





/*Limit
2
Enter the employee number,salary,name of the employee:
1
3455
aaa
Enter the employee number,salary,name of the employee:
2
4500
wer
Enter the eno:
5
Employee not found:
Limit
3
Enter the employee number,salary,name of the employee:
1
19000
ana
Enter the employee number,salary,name of the employee:
2
50000
anakha
Enter the employee number,salary,name of the employee:
3
3000
renu
Enter the eno:
1
Employee found
*/