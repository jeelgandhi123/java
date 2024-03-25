import java.util.Scanner;
class ch_7d_factorial
{
    static int fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    
	    System.out.print("Enter number:");
	    int n= input.nextInt();
	    
		int x=fact(n);
		
		System.out.println("the factorial of "+n+ " is "+x);
	}
}
