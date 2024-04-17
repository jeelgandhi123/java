class parent{
    public parent(){
        System.out.println("i am constructor in parent class!!!!!!!!!!!!!!!!!!!!");
    }
}
class child extends parent{
    child(){
        System.out.println("i am constructor in child class!!!!!!!!!!!!!!!!");
    }
}
class grandchild extends child{
    grandchild(){
        System.out.println("i am constructor in grandchild class!!!!!!!!!!!!!");
    }
}
class ch_10c_constructor_in_inheritance
{
	public static void main(String[] args) {
	   System.out.println("output of parent class-------------------");
       parent p1=new parent();
       //it will gives the output of only parent class.
       
       System.out.println("output of child class-------------------");
       child c1=new child();
       //it will gives the output of child class and parent class becuase it extend parent class
       
       System.out.println("output of grandchild class-------------------");
       grandchild gd=new grandchild();
       //it will gives the output of grandchild class,child class and parent class becuase it extend child class and child class extend parent class 
       
	}
}
