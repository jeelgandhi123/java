import java.util.Scanner;
class ch_01d_calculator
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("enter number 1:");
		int a= input.nextInt();
		
		System.out.print("enter number 2:");
		int b= input.nextInt();
		
		int sum=a+b,sub=a-b,multi=a*b,div=a/b;
		
		System.out.println("the sumation of these number are :"+sum);
		System.out.println("the substraction of these number are :"+sub);
		System.out.println("the multiplication of these number are :"+multi);
		System.out.println("the division of these number are :"+div);
		
	}
}
