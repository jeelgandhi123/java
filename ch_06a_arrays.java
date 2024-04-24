class ch_06a_arrays
{
	public static void main(String[] args) {
	System.out.println("arrays.....");
		
		//how arrays works.....
		int[] marks=new int[5];
		
		//int [] marks={34,45,56,76,79};
		
		marks[0]=34;
		marks[1]=45;
	        marks[2]=54;
	        marks[3]=69;
	        marks[4]=00;
	    
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		//marks.length....
		System.out.println("it gives the length of array:"+marks.length);
		
		//printing using for loop
		for(int i=0;i<marks.length;i++){
		    System.out.println(marks[i]);
		}
		
		System.out.println("printing marks in reverse order...");
		 
		for(int j=marks.length-1;j>=0;j--){
           System.out.println(marks[j]);
		}
		
		System.out.println("printing using for each loop:");
		for(int element:marks){
		    System.out.println(element);
		}
	
	}
}
