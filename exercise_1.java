import java.util.Scanner;
class exercise1
{
	public static void main(String[] args) {
	   	Scanner input= new Scanner(System.in);
	   	
	   	System.out.print("enter your name:");
	   	String name=input.nextLine();
		
		System.out.print("enter marks of subject 1:");
		int sub1= input.nextInt();
		
		System.out.print("enter marks of subject 2:");
		int sub2= input.nextInt();
		
		System.out.print("enter marks of subject 3:");
		int sub3= input.nextInt();
		
		System.out.print("enter marks of subject 4:");
		int sub4= input.nextInt();
		
		System.out.print("enter marks of subject 5:");
		int sub5= input.nextInt();
		
	    float percentage = ((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
	    System.out.println("congratulation " +name+ " you got "+percentage+" percentage.");
	}
}
