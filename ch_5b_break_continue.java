class ch_5b_break_continue
{
	public static void main(String[] args) {
		System.out.println("break and continue....");
		
		for(int a=0;a<4;a++){
		    System.out.println(a);
		    //now use break here....
		    if(a==1){
		     System.out.println("i will end this loop using break..");
		     break;
		   }}
	
	   for(int b=0;b<4;b++){
	       if(b==2){
	           System.out.println("i will use continue statment here...");
	           continue;
	       }
	       System.out.println(b);
	   }
}
}
