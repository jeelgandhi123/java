class ch_07b_without_static
{
    int sum(int a,int b){
       int c;
        c=a+b;
        return c;
}

public static void main(String[] args) {
        int a=3,b=99,c;
        //classname obj=new classname()
        Main obj = new Main();
        //obj.methodname
        c= obj.sum(a,b);
        System.out.println("the sum of "+a+" and "+b+" is :" +c);
    }
}
