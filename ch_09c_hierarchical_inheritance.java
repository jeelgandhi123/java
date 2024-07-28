class parent{
    void Hello(){
        System.out.println("Hello");
    }
    }
class child1 extends parent{
        void greetby1(){
            System.out.println("good morning!!");
        }
    }
class child2 extends parent{
    void greetby2(){
        System.out.println("good night!!!");
    }
}    
class ch_09c_hierarchical_inheritance
{
	public static void main(String[] args) {
		parent p=new parent();
		p.Hello();
	    
	    child1 c1=new child1();
	    c1.Hello();
	    c1.greetby1();
	    
	    child2 c2=new child2();
	    c2.Hello();
	    c2.greetby2();
	    
	}
}
