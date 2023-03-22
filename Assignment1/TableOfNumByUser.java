import java.util.Scanner;
class TableOfNumByUser {
	public static  void main(String[] args) {
		int num;
		System.out.println("Enter any number for Table");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Table of "+ num +" :\n");
		for(int i=1; i<=10; i++){
		System.out.println(num*i);
		}
	}
}