class parent {
    int a;
    parent(int a){
        this.a = a;//use to refrence qwn class variable....
    }
    public int getA(){
        return a;
    }
}
class child extends parent{
    child(int x){
        super(x);//use to print their own class....
        System.out.println("i am constuctor!");
    }
    
}
class ch_10e_this_and_super
{
	public static void main(String[] args) {
// 	parent p1=new parent(55);
// 	System.out.println(p1.getA());
	
	child c1=new child(89);
	}
}
