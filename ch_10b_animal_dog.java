class animal{
    public void walking(){
        System.out.println("they can walking!!");
    }
    public void eating(){
        System.out.println("they can eating!!");
    }
}
class dog extends animal{
    public void barking(){
        System.out.println("they can barking!!!");
    }
}

class ch_10b_animal_dog
{
	public static void main(String[] args) {
	animal a=new animal();
	
	a.walking();
	a.eating();
// 	a.barking();              this will error
    
    System.out.println("--------------with respect to dog--------------");     
    dog d=new dog();
    
    d.walking();
    d.eating();
    d.barking();
    
	}
}
