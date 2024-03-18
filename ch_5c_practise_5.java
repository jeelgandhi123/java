class ch_5c_practise_5
{
	public static void main(String[] args) {
	    //problem1....
	    int n = 4;
          for (int i=n; i>0; i--){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.print("\n");
        }
        
        //problem2.....
        int sum=0,a=3;
        for(int l=0;l<a;l++){
         sum=sum+(2*l);
        }
        System.out.println("\nthe sum of first "+a+ " number is "+sum+ "\n");
        
        
        //problem3....
        int num=4;
        for(int x=1;x<=10;x++){
            System.out.printf("%d X %d=%d\n", num,x,num*x);
	    }
	
         //problem4....
	    for(int y=10;y>=1;y--){
            System.out.printf("%d X %d=%d\n", num,y,num*y);
	    }
	    
	    
	    //problem5....
	    int fact=1;
	    for(int z=1;z<=num;z++)
	    {
	        fact=fact*z;
	    }
	    System.out.println("\n\nthe factorial of "+num+ " is "+fact);
	  
	}
}
