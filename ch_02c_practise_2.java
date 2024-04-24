import java.util.Scanner;
class ch_02c_practise_2
{
  public static void main (String[]args)
  {
	//problem1....
	  float x = 7 / 4 * 9 / 2;
	  System.out.println (x);

	//problem2...
	  Scanner sc = new Scanner (System.in);
	  System.out.print("enter your marks:");
	  int marks = sc.nextInt ();

	  marks += 8;
	  System.out.println(marks);
	  
	  //problem3....
	  System.out.print("enter your number:");
	  int num = sc.nextInt ();
	  
	   if(num>34){
	       System.out.print("your number is bigger than 34");
	   }
	   else{
	       System.out.print("your number is smaller than 34");
	   }
	  
	  //problem4
	  System.out.print("enter v:");
	  int v = sc.nextInt ();
	  
	  System.out.print("enter u:");
	  int u = sc.nextInt ();
	  
	  System.out.print("enter a:");
	  int a = sc.nextInt ();

      System.out.print("enter s:");
	  int s = sc.nextInt ();
	  
	  float formula=((v*v)-(u*u))/(2*a*s);
	  System.out.print("the value of formula:"+formula);
	  
	  //problem5...
	  int y=7*49/7+35/7;
	  System.out.print(y);
  }
}
