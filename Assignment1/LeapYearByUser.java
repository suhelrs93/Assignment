import java.util.Scanner;
class LeapYearByUser {
	public static  void main(String[] args) {
		int y;
		System.out.println("Enter an Year");
		Scanner sc=new Scanner(System.in);
		y=sc.nextInt();
		if (y%4==0){
		System.out.println(y + " is Leap Year");
		}
		else
			System.out.println(y + " is Not Leap Year");
		
		}
		}