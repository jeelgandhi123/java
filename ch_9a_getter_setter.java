class circle{
    private double radius;
    private double area;
    private double perimeter;
    
    public void check_radius(double r){
        radius=r;
    }
    public void check_area(double a){
        this.area=3.14*radius*radius;
        if(a==area){
            System.out.println("correct!!!");
        }
        else{
            System.out.println("not correct!!!");
        }
    }
    public void check_perimeter(double peri){
        this.perimeter=2*3.14*radius;
        if(perimeter==peri){
            System.out.println("correct!!!");
        }
        else{
            System.out.println("not correct!!!");
        }
    }
} 
class ch_9a_getter_setter
{
	public static void main(String[] args) {
		circle justcheck=new circle();
		justcheck.check_radius(8);
		justcheck.check_area(200.96);
		justcheck.check_perimeter(50.24);
	}
}
