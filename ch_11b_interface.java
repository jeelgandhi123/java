interface bicycle{
    void ridding();
    void ringing();
    void upplied_break();
}

class avoncycle implements bicycle{
    public void ridding(){
        System.out.println("someone is ridding the bicycle!!!");
    }
    public void ringing(){
        System.out.println("someone is ringing the bell!");
    }
    public void upplied_break(){
        System.out.println("someone is uplieding break");
    }
}
class ch_11b_interface {
    public static void main(String[] args) {
        avoncycle av1=new avoncycle();
        av1.ringing();
        av1.ridding();
        av1.upplied_break();
        
        System.out.println("2nd method!!!");
        bicycle av2=new avoncycle();
        av2.ringing();
        av2.ridding();
        av2.upplied_break();
    }
}
