class parent{
    public parent(){
        System.out.println("i am constructor in parent class!!!!!!!!!!!!!!!!!!!!");
    }
    parent(int a){
        System.out.println("the value of a is:"+a);
    }
}
class child extends parent{
    child(){
        System.out.println("i am constructor in child class!!!!!!!!!!!!!!!!");
    }
    child(int a,int b){
        super(a);//output of parent class.............
        System.out.println("the value of  b is:"+b);
    }
}

class ch_10d_constuctor_overloading
{
	public static void main(String[] args) {
	    System.out.println("output of parent()");
	    parent p1=new parent();
	    
	    System.out.println("----------------------------------------------------------------");
	    
	    System.out.println("output of parent(int a)");
        parent p2=new parent(34);
        
        System.out.println("----------------------------------------------------------------");
	    
	    System.out.println("output of child()");
        child c1=new child();
        
        System.out.println("----------------------------------------------------------------");
        
        System.out.println("output of child(int a, int b)");
        child c2=new child(54,45);

	}
}
