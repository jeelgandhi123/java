 class parent{
    void greetgm(){
        System.out.println("good morning!!!");
    }
}
class child extends parent{
    void greengn(){
        System.out.println("good night!!!");
    }
}
class ch_09a_single_inheritance
{
	public static void main(String[] args) {
	    parent p1=new parent();
	    p1.greetgm();
	    
	    child c1=new child();
	    c1.greetgm();
	    c1.greengn();
	}
}
