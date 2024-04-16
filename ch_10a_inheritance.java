class parents{
    int x;
    
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
        System.out.println("i am parent class ");
    }
}
class child extends parents{
    int y;
    
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
        System.out.println("i am child class ");
    }
}



class ch_10a_inheritance
{
	public static void main(String[] args) {
		parents p1=new parents();
		
		p1.setx(8);
		System.out.println("with the help of p1:"+p1.getx());
// 		p1.sety(80);                          it will throw the error becuase parent class can't able to call...
// 		System.out.println(p1.gety());


		System.out.println("----------------child class--------------------");
		
		
		child c1=new child();
		
		c1.setx(73);
		System.out.println("with the help of c1:"+c1.getx());//access parent 
		c1.sety(89);
		System.out.println("with the help of c1:"+c1.gety());//as well as there own class
		
	}
}
