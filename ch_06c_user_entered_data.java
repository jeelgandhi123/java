import java.util.Scanner;
class ch_06c_user_entered_data
{
	public static void main(String[] args) {
	    
	    Scanner input=new Scanner(System.in);
	    
	    System.out.print("enter number:");
	    int number=input.nextInt();
	    
	    int[] justarray=new int[number];
	    
	    for(int i=0;i<number;i++){
	            justarray[i]=input.nextInt();
	    }
	    System.out.println("entered array:");
	    for(int i=0;i<number;i++){
	        System.out.print(justarray[i]+" ");
	    }
	    
	    ////matrix................................//
	    System.out.print("\nenter no of rows:");
	    int row=input.nextInt();
	    
	    System.out.print("enter no of coloum:");
	    int coloum=input.nextInt();
	    
	    int[][] maxtrix=new int[row][coloum];
	    for(int a=0;a<row;a++){
	        for(int b=0;b<coloum;b++){
	            maxtrix[a][b]=input.nextInt();
	        }
	    }
	    
	    System.out.println("entered maxtrix:");
	     for(int a=0;a<row;a++){
	        for(int b=0;b<coloum;b++){
	            System.out.print(maxtrix[a][b]+" ");
	        }
	         System.out.println(" ");
	     }
	}
}
