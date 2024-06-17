interface sample{
    void meth1();
    void meth2();
}
interface sample1 extends sample{
    void meth3();
    void meth4();
}
class SAMPLE implements sample1{
    public void meth1(){
        System.out.println("meth1!!!");
    }
    public void meth2(){
        System.out.println("meth2!!!");
    }
    public void meth3(){
        System.out.println("meth3!!!");
    }
    public void meth4(){
        System.out.println("meth4!!!");
    }
}
class ch_11d_inheritance_interface
{
	public static void main(String[] args) {
	SAMPLE s1=new SAMPLE();
	s1.meth1();
	s1.meth2();
	s1.meth3();
	s1.meth4();
	}
}
