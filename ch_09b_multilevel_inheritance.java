 class grandparent{
    void greetgm(){
        System.out.println("good morning!!!");
    }
}
class parent extends grandparent{
    void greethello(){
        System.out.println("hello!!!");
    }
}
class child extends parent{
    void greengn(){
        System.out.println("good night!!!");
    }
}
class ch_09b_multilevel_inheritance
{
	public static void main(String[] args) {
	    grandparent gp1=new grandparent();
	    gp1.greetgm();
	    
	    parent p1=new parent();
	    p1.greetgm();
	    p1.greethello();
	    
	    child c1=new child();
	    c1.greetgm();
	    c1.greengn();
	    c1.greethello();
	}
}
