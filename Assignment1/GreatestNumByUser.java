import java.util.Scanner;
class GreatestNumByUser {
	public static  void main(String[] args) {
		int a, b, c;
		System.out.println("Enter The First Number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter The Second Number : ");
		b=sc.nextInt();
		System.out.println("Enter The Third Number : ");
		c=sc.nextInt();
		if (a>b && a>c){
		System.out.println(a + " is Greatest Number");
		}
		else if (a<b && b>c){
		System.out.println(b + " is Greatest Number");
		}
		else {
			System.out.println(c + " is Greatest Number");
		}
	}
}