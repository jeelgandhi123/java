import java.util.Scanner;
class ch_07e_fibonacci
{
    static int fibonaci(int a){
        if(a==0){
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else{
            return fibonaci(a-1)+fibonaci(a-2);
        }
    }
    
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    
	    System.out.print("Enter number:");
	    int num= input.nextInt();
	    
	   /*0=0
	   1=1
       2=(2-1)+(2-2)=1+0=1
       3=(3-1)+(3-2)=2+1=1+1=2
       .....*/
       
		 for (int i = 0; i < num; i++) {
            System.out.print(fibonaci(i) + " ");
        }
	}
}
