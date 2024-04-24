class ch_04d_practise_4
{
	public static void main(String[] args) {
		//problem1....
		int a=10;
		if(a==11){
		    System.out.print("i am 11\n\n");
		}
		else{
		    System.out.print("i am not 11\n\n");
		}
		
		//problem2...
		int sub1=90,sub2=00,sub3=5;
		int percentage=(sub1+sub2+sub3)/3;
		System.out.printf("%d",percentage);
		
		if(percentage>33){
		    System.out.print("\npass");
		}
		else{
		    System.out.print("\nfail\n\n");
		}
		
		//problem3...
		int income=780000;
		double tax=0;
		if(income > 250000 && income < 500000)
		{
		    tax=tax+0.05;
		    System.out.println("your tax increase: "+tax);
		}
		else if(income > 500000 && income < 1000000){
		    tax=tax+0.2;
		    System.out.println("your tax increase: "+tax);
		}
		else{
		    tax=tax+0.3;
		    System.out.println("your tax increase: "+tax);
		}
		
		//problem4 already done..
		
		//problem5...
		int year=2024;
		if(year%4==0){
		    System.out.println("leap year");
		}
		else{
		    System.out.println("non leap year");
		}
		
		
		//problem6....
	   String c_name="jeel.com";
	   if(c_name.endsWith(".org")){
	       System.out.println("this is org website");
	   }
	  else if(c_name.endsWith(".com")){
	      System.out.println("this is commercial website");
	  }
		
	}
}
