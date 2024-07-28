interface fruit{
    void taste();
    void eat();
}

class mango implements fruit{
    public void taste(){
        System.out.println("very taste!!!");
    }
    public void eat(){
        System.out.println("very good !!!");
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
