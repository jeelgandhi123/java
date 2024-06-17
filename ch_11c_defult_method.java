interface camera{
    default void take_photo(){
        System.out.println("taking photo");
    }
    void record_video();
}
interface wifi{
    void get_signal();
    default void connect_to_network(){
        System.out.println("connected!");
    }
}

class smartphone  implements wifi,camera{
    public void record_video(){
        System.out.println("recording");
    }
    public void get_signal(){
        System.out.println("out of reach!");
    }
}
class ch_11c_defult_method
{
	public static void main(String[] args) {
		smartphone s1=new smartphone();
		s1.take_photo();
		s1.record_video();
		s1.get_signal();
		s1.connect_to_network();
		
	}
}
