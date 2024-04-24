class employee{
    private int id;
    private String name;
    
    public void setid(int i){
        id=i+1;
    }
    public int getid(){
        return id;
    }
    
    //name....
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
}
class ch_09b_getter_setter{
    public static void main (String[] args) {
        employee x=new employee();
        
        x.setid(78);
        System.out.println(x.getid());
        
        x.setname("my name is jeel");
        System.out.println(x.getname());
    }
}
