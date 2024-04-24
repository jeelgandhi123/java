class cylinder{
    private int height;
    private int radius;
    
    public int setheight(){
        return height;
    }
    public void getheight(int h){
        height=h;
    }
    
    public int setradius(){
        return radius;
    }
    public void getradius(int r){
        radius=r;
    }
    
    public double area(){
       return 2*3.14*radius*(height+radius);
    }
    public double volume(){
       return 3.14*radius*radius*height;
    }
    
    //using constructor....
    public cylinder(){
        radius=34;
        height=45;
    }
    public cylinder(int r,int h){
        radius=r;
        height=h;
    }
}


class rectangle{
    private int length;
    private int breath;
    
    public rectangle(){
        length=4;
        breath=5;
    }
    public rectangle(int l,int b){
        length=l;
        breath=b;
    }
    
    public int  getlength(){
        return length;
    }
     public int getbreath(){
        return breath;
    }
    
}

class ch_09e_practise_9
{
	public static void main(String[] args) {
	//problem1....
	   /*cylinder c1=new cylinder();
	   c1.getradius(3);
	   c1.getheight(5);
	   System.out.println("you entered radius:"+c1.setradius());
	   System.out.println("you entered height:"+c1.setheight());
	   System.out.println("the area of cyliner is: "+c1.area());
	   System.out.println("the volume of cylinder is: "+c1.volume());*/

	   //problem2...
	    cylinder c0=new cylinder();
	    System.out.println("you entered radius:"+c0.setradius());
		System.out.println("you entered height:"+c0.setheight());
		System.out.println("the area of cyliner is: "+c0.area());
		System.out.println("the volume of cylinder is: "+c0.volume());
		
        cylinder c1=new cylinder(34,45);
		System.out.println("you entered radius:"+c1.setradius());
		System.out.println("you entered height:"+c1.setheight());
		System.out.println("the area of cyliner is: "+c1.area());
		System.out.println("the volume of cylinder is: "+c1.volume());
		
		//problem3...
		rectangle r=new rectangle();
		System.out.println(r.getlength());
		System.out.println(r.getbreath());
		
		rectangle r1=new rectangle(34,56);
		System.out.println(r1.getlength());
		System.out.println(r1.getbreath());
	
	}
}
