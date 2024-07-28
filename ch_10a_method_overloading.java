class sum{
    int add_number(int a,int b){
        return a+b;
    }
    int add_number(int p,int q,int r){
        return p+q+r;
    }
    int add_number(int x,int y,int z,int w){
        return x+y+z+w;
    }
}
class ch_10a_method_overloading
{
	public static void main(String[] args) {
	    sum s1=new sum();

	    System.out.println("the sum of 2 Integer:"+ s1.add_number(34,23));
	    System.out.println("the sum of 3 Integer:"+ s1.add_number(12,123,11));
	    System.out.println("the sum of 4 Integer:"+ s1.add_number(11,3,21,321));
	}
}
