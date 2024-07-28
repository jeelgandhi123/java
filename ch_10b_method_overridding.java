class animal{
    void sound(){
        System.out.println("the animal can make sound!!!");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog sound like:boobooboo");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("cat sound like:miooomiooo");
    }
}

class ch_10b_method_overridding
{
	public static void main(String[] args) {
	    animal a1=new animal();
	    a1.sound();
	    dog d1=new dog();
	    d1.sound();
	    cat c1=new cat();
	    c1.sound();
	}
}
