class A{
    public void method_x(){
        System.out.println("i am method x of class A");
    }
    }
class B extends A{
    @Override
    public void method_x(){
        System.out.println("i am method x of class B");
    }
    public void method_y(){
        System.out.println("i am method y of class B");
    }
}

class ch_10f_methodoverridding
{
	public static void main(String[] args) {
	A a=new A();
	a.method_x();
	
	System.out.println("----------------------");	
	B b =new B();
	b.method_x();
	b.method_y();
	}
}
