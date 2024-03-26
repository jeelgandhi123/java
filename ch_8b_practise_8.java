class employee{
 int salary;
 String name;
     public int getsalary(){
     return salary+10000;
   }
     public String getname(){
     return name;
   }
     public void setname(String n){
     name=n;
   }
}

class cellphone{
    public void action1(){
        System.out.println("ringing!!!");
    }
    public void action2(){
        System.out.println("vibrating!!!");
    }
}

class square{
    int side;
    public int area(){
        return (side*side);
    }
    public int perimeter(){
        return (4*side);
    }
}
public class ch_8b_practise_8
{
	public static void main(String[] args) {
	    //problem1....
		employee emp1=new employee();
		
		emp1.name="ramesh";
		emp1.salary=90000;
		
		System.out.println("my salary: " +emp1.salary);//this will give 90000
		
		emp1.getsalary();
		System.out.println("incremneted salary: " +emp1.getsalary());//this will give incremented salary
		
		emp1.getname();
		System.out.println("name:"+emp1.getname());//this will give name
		
		emp1.setname("suresh");//change name
		System.out.println("changed name:"+emp1.getname());//give changed name
		
        //problem2...
        cellphone samsung=new cellphone();
        samsung.action1();
        samsung.action2();
        
        //problem3
        square p3=new square();
        
        p3.side=9;
        
        p3.area();
        System.out.println("area :"+p3.area());
        p3.perimeter();
        System.out.println("perimeter:"+p3.perimeter());
	}
}
