abstract class parent{
    //make parent class 
    int parent_age;
    abstract void basic_info();
    //becuase of basic_info abstact the parent class is abstact
}
class child extends parent{
    //here aplied inheritance
    public void basic_info(){
        System.out.println("hello i am abstact class");
    }
}
class ch_11a_abstract{
     public static void main (String[] args) {
    parent p1=new child(); //this line is important
    p1.basic_info();
}
}
