class ch_7f_practise_7
{
    static void table(int n){
       for(int i=1;i<=10;i++){
          System.out.printf("%d X %d=%d\n",n,i,n*i);
       }
    }
    
    static void pattern(int n){
        for(int x=0;x<n;x++){
            for(int y=0;y<x+1;y++){
                System.out.print("*");
        }
        System.out.print("\n");
    }
    }
    static int mysum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+mysum(n-1);
        }
    }
    
    static void pattern1(int n){
        for(int p=n;p>=0;p--){
            for(int q=p-1;q>=0;q--){
                System.out.print("*");
        }
        System.out.print("\n");
    }
    }
    static float converter(float celsius){
        return  (celsius * 1.8f) + 32.0f;
    }
	public static void main(String[] args) {
		System.out.println("problem:1");
		table(3);
		System.out.println("problem:2");
		pattern(4);
		System.out.println("problem:3");
		int c=mysum(4);
		System.out.println("the sum of first 4 natural number is "+c);
		System.out.println("problem:4");
	    pattern1(4);
	    System.out.println("problem:5");
	    float ferenhit=converter(89.0f);
	    System.out.println(ferenhit);
	}
}
