class ch_2a_operators
{
	public static void main(String[] args) {
		System.out.print("operators and expressions!!!!\n");
		
		System.out.print("arithmatic operators:+,-,*,/,%\n");
		int a=2,b=3,sum=a+b,sub=a-b,multi=a*b,div=a/b,module=a%b;
		System.out.print("the sum is:"+sum);
		System.out.print("\nthe substraction is:"+sub);
		System.out.print("\nthe multi is:"+multi);
		System.out.print("\nthe division is:"+div);
		System.out.print("\nthe modulo is:"+module);
		
		System.out.print("\nassignment operators:==,+=,-=\n");
		System.out.print(a==b);//false because they are not same.
		a+=1;//means a=a+1
		System.out.print(a);
		
		System.out.print("\ncomparison operators:==,>=,<=\n");
		System.out.print(a>=b);//here a is now 3 so...
		System.out.print(a<=b);
		
		System.out.print("\nlogical operators:&&,|| \n");
		System.out.print(a>b||a<b);
		System.out.print(a>b&&b>a);
	}
}
