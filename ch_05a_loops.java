class ch_05a_loops
{
  public static void main (String[]args)
  {   
    System.out.print("loops.....\n");
    
    int i=1;
    while(i<3){
        System.out.print("using while loop:"+i+"\n");
        i++;
    }
    
    
    int a=1;
    do{
        System.out.print("using do-while loop:"+a+"\n");
        a++;
    }while(a<3);
    
    
    for(int b=1;b<3;b++){
        System.out.print("using for loop:"+b+"\n");
    }
  }
}
