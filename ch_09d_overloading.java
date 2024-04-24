class collage{
    int student_id;
    String student_name;
    
    public collage(){
        //class name and the constructor name must be same....
        student_id=90;
        student_name="hello!!";
    }
    public collage(int id){
        student_id=id;
        student_name="none!!";
    }
    public collage(int id,String name){
        student_id=id;
        student_name=name;
    }

    public int print_student_id(){
        return student_id;
    }
    public String print_student_name(){
        return student_name;
    }
}
class ch_09d_overloading
{
	public static void main(String[] args) {
		/*collage jeel=new collage();
	    System.out.println("my id no is:"+jeel.print_student_id());
	    System.out.println("my name is:"+jeel.print_student_name());*/
	    
	   // collage jeel=new collage(67);
	   // System.out.println("my id no is:"+jeel.print_student_id());
	   // System.out.println("my name is:"+jeel.print_student_name());
	    
	    collage jeel=new collage(89,"rahul modi");
	     System.out.println("my id no is:"+jeel.print_student_id());
	    System.out.println("my name is:"+jeel.print_student_name());
	    
	    
	}
}
