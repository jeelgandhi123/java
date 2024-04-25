abstract class parent{
    public parent(){
        System.out.println("i am constructor of parent class");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class child1 extends parent{
    @Override
    public void greet(){
        System.out.println("good morning!");
    }
}
abstract class child2 extends parent{
    public void saygood(){
        System.out.println("i am good !!");
    }
}
class ch_11a_abstract
{
	public static void main(String[] args) {
    // parent p1=new parent();----------error
    child1 c1=new child1();
    // child2 c2=new child2();----------error
	}
}
