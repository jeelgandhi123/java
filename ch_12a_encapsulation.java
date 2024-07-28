class school{
    private String name;
    private int rollno;
    
    //getter
    public String getname(){
        return name;
    }
    public int getrollno(){
        return rollno;
    }
    
    //setter
    public void setname(String newname){
        name=newname;
    }
    public void setrollno(int newrollno){
        rollno=newrollno;
    }
}

class Main
{
	public static void main(String[] args) {
		school sc=new school();
		sc.setname("jeel");
		sc.setrollno(19);
		
		System.out.println("name:"+sc.getname());
		System.out.println("rollno:"+sc.getrollno());
	}
}
