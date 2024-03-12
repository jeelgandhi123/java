import java.util.Scanner;
class f7
{
	public static void main(String[] args)
	{ 
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter radius::");
	int r=input.nextInt();
	
	double area=3.14*r*r;
	
	System.out.print("the area of circle:"+area);
	}
}
