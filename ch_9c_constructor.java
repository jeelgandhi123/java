class collage{
    int student_id;
    String student_name;
    
    public collage(){
        //class name and the constructor name must be same....
        student_id=90;
        student_name="hellu!!";
    }

    public int print_student_id(){
        return student_id;
    }
    public String print_student_name(){
        return student_name;
    }
}
class ch_9c_constructor
{
	public static void main(String[] args) {
		collage jeel=new collage();
		
	    System.out.println("my id no is:"+jeel.print_student_id());
	    System.out.println("my name is:"+jeel.print_student_name());
	}
}
