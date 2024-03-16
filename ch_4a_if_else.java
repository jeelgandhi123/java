import java.util.Scanner;
class ch_4a_if_else
{
  public static void main (String[]args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter your age:");
	int age= sc.nextInt();
	
	if(age>18){
	    System.out.print("you can drive!");
	}
	else{
	    System.out.print("you can't drive");
	}
  }
}
