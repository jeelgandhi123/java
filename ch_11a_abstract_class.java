abstract class fruit{
    abstract public void taste();
    public void eat(){
        System.out.println("let's eat!!!");
    }
} 
class mango extends fruit{
    public void taste(){
        System.out.println("let's taste sweet mango!!!");
    }
}
class Main
{
	public static void main(String[] args) {
		mango m1=new mango();
		m1.taste();
		m1.eat();
	}
}
