abstract class parent{
    void love(){
        System.out.println("the parent is loving his/her child");
    }
    abstract void call();
}

class child extends parent{
    public void call(){
        System.out.println("the parent is calling his/her child");
    }
}

class ch_11a_absract {
    public static void main(String[] args) {
       child c1=new child();
       c1.call();
       c1.love();
    }
}
