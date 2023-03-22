import java.util.Scanner;
class CheckSignByUser {
	public static  void main(String[] args) {
		int a;
		System.out.println("Enter any Number for checking Positive OR Negative");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if (a<0){
		System.out.println(a + " is Negative Number");
		}
		else
			System.out.println(a + " is Positive Number");
		
		}
		}