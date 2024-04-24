class ch_07a_method_static
{
    static int sum(int x,int y){
        int z;
        z=x+y;
        return z;
        
    }
    public static void main (String[]args)
    {   
        int a=90,b=80,c;
        c=sum(a,b);
        System.out.print("the sum of "+a+" and "+b+" is :" +c);
  }
}
