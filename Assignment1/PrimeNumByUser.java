import java.util.Scanner;
class PrimeNumByUser {

  public static void main(String[] args) {
	  
	  int num;
	  System.out.println("Enter any Number for cheking Prime or Not : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	  int half=0;
	  int count=0;
	  
	  half=num/2;
	  
	  if(num==0 || num==1){
		  System.out.println(num+" is not prime number");
	  }
	  else {
		  for(int i=2;i<=half;i++){
			  
			  if(num%i==0){
				  System.out.println(num+" is Not Prime Number");
				  count=1;
				  break;
			  }
		  }
		  
		  if(count==0){
			  System.out.println(num+" is Prime Number");
		  }
	  }
  }
}