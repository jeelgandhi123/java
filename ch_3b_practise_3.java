class ch_3b_practise_3
{
public static void main(String[] args) {
    //problem1.....
    String name="JEEL";
    System.out.println(name.toLowerCase());
    
    //problem2....
    String myname="jeel gandhi hemi gandhi";
    System.out.println(myname.replace(" ","_"));
    
    //problem3..
    String letter="Dear </name/> thanks a lot for helping me!!";
    System.out.println(letter.replace("</name/>","viratkohli"));
    
    //problem4......
    String justname="vipul gandhi  jyotika gandhi   ";
    System.out.println(justname.indexOf("  "));
    System.out.println(justname.indexOf("   "));
    
    //problem5.....
    String myletter="dear sir\n\ttoday i am absent because of my health is not good.\nthanks!!";
    System.out.println(myletter);
	}
}
