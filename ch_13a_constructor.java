class jeel{
    jeel(){
        System.out.println("this is defult constructor!!!");
    }
    jeel(int a){
        System.out.println("this is parameterized construtor!! the value of a is:"+a);
    }
} 
class Main
{
	public static void main(String[] args) {
		jeel jeel1=new jeel();
		jeel jeel2=new jeel(89);
	}
}
