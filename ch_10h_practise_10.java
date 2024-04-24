class circle{
    int radius;
    circle(){
        System.out.println("i am constructor of circle class");
    }
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    public double volume(double radius){
        return 1.33*Math.PI*radius*radius*radius;
    }
}
class cylinder extends circle{
    cylinder(){
        System.out.println("i am constructor of cylinder class");
    }
    int radius;
    int height;
    public double area(double height, double radius){
        return 2*Math.PI*radius*(height + radius);
    }
    public double volume(double height, double radius){
        return Math.PI*radius*radius*height;
    }
}

class base{
    base(){
    System.out.println("hello i am base class!!!");
    }
}
class derive1 extends base{
    derive1(){
    System.out.println("hello i am derive1 class!!!");
    }
}
class derive2 extends derive1{
    derive2(){
    System.out.println("hello i am derive2 class!!!");
    }
}
class ch_10h_practise_10
{
	public static void main(String[] args) {
	System.out.println("problem_1 and problem_2");
	circle c1=new circle();
	System.out.println("the area of circle is "+c1.area(45));
	System.out.println("the volume of circle is "+c1.area(23));
    System.out.println("--------------------------------");
	cylinder c2=new cylinder();
	System.out.println("the area of cylinder is "+c2.area(45,76));
	System.out.println("the volume of cylinder is "+c2.volume(15,96));
	
	System.out.println("--------------------------------");
    System.out.println("problem_3");
    base b1=new base();
    System.out.println("--------------------------------");
    derive1 d1= new derive1();
    System.out.println("--------------------------------");
    derive2 d2=new derive2();
	}
}
