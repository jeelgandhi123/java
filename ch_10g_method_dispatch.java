class phone{
    public void ringing(){
        System.out.println("the phone is ringing");
    }
    public void vibrating(){
        System.out.println("the phone is vibrating");
    }
}
class smartphone extends phone{
    @Override
    public void vibrating(){
        System.out.println("the smartphone is vibrating");
    }
    public void musicing(){
         System.out.println("the smartphone is musicing");
    }
}
class ch_10g_method_dispatch
{
	public static void main(String[] args) {
    phone p1=new phone();
    smartphone sp1=new smartphone();
    
    phone p2=new smartphone();
    //with the help of super class we can create sub class object....
    p2.ringing();
    p2.vibrating();
    // p2.musicing();....................not allowed
    
    // smartphone sp2=new smartphone();....................not allowed
	}
}
