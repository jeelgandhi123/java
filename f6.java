import java.util.Scanner;
class f6
{
	public static void main(String[] args) {
	   	Scanner input= new Scanner(System.in);
	   	
		System.out.print("enter kilometer:");
		int km= input.nextInt();
		
	   double miles =0.62 * km;
	   System.out.println("the miles for "+km+ " is "+miles);
	}
}
