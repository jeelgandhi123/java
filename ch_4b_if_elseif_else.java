import java.util.Scanner;
class ch_4b_if_elseif_else
{
  public static void main (String[]args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number 1:");
	int num1=sc.nextInt();
	
	System.out.print("enter number 2:");
	int num2=sc.nextInt();
	
	System.out.print("enter number 3:");
	int num3=sc.nextInt();
	
	if(num1>num2){
	    if(num1>num3){
	        System.out.println(num1+" is greatest");
	    }
	    else{
	         System.out.println(num3+" is greatest");
	    }
	}
	else
	    if(num2>num3){
	        System.out.println(num2+" is greatest");
	    }
	    else{
	         System.out.println(num3+" is greatest");
	    }
	}}
