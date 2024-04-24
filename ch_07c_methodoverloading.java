class ch_07c_methodoverloading
{
    static void multi(){
        System.out.println("example");
    }
    static int multi(int a,int b){
        int c=a+b;
        return c;
    }
    static int multi(int a,int b, int c){
        int d=a+b+c;
        return d;
    }
	public static void main(String[] args) {
	 System.out.println("method overloading!! the method overloading is that the multiple method have same name...");
	 
	 System.out.println("--------------------------");
	 multi();   
	 
	 int x=multi(34,78,56);
	 System.out.println(x);
	 
	 int y=multi(56,76);
	 System.out.println(y);
	}
}
