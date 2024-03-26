class employee{
    int id;
    int salary;
    String name;
    public void detail(){
        System.out.println("hello!! my id is "+id+" , my name is "+name+" and my salary is " +salary);
    }
    public int getsalary(){
        return (salary+10);//just salary increment ....
    }
}
    
public class ch_8a_class_object
{
	public static void main(String[] args) {
		employee jeel=new employee();//object..
		employee john=new employee();
		
		//setting attributes...
		jeel.id=900;
		jeel.name="jeel_gandhi";
		jeel.salary=90000;
		
		john.id=901;
		john.name="john_cena";
		john.salary=100000;
	
		jeel.detail();
		
		john.detail();
		
		System.out.println(jeel.getsalary());
		System.out.println(john.getsalary());
		
	}
}
