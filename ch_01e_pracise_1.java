import java.util.Scanner;
class ch_01e_pracise_1
{
	public static void main(String[] args) {
	    //problem1...
	    int a=12,b=45,sum=a+b;
	    System.out.println(sum);
	    
	    //problem2....
	   	Scanner input= new Scanner(System.in);
	   	
		System.out.print("enter marks of subject 1:");
		int sub1= input.nextInt();
		
		System.out.print("enter marks of subject 2:");
		int sub2= input.nextInt();
		
		System.out.print("enter marks of subject 3:");
		int sub3= input.nextInt();
		
	   double cgpa=((sub1+sub2+sub3)/3.0)/10;
	   System.out.println("congratulations you got:"+cgpa);
	   
	   //problem3...
	  
	   System.out.print("enter your name:");
	   String name= input.nextLine();
	   
	   System.out.println("hello "+name+" have a good day buddy!!");
		
		//problem4......
		System.out.print("enter kilometer:");
		int km= input.nextInt();
		
	   double miles =0.62 * km;
	   System.out.println("the miles for "+km+ " is "+miles);
	}
}
