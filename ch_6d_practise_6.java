class ch_6d_practise_6
{
	public static void main(String[] args) {
	    
	//problem1....
	float[] p1={34.5f,56.7f,78.5f,34.3f,45.6f};
    float sum=p1[0]+p1[1]+p1[2]+p1[3]+p1[4];
    
    System.out.println(sum);
    
    //problem2....
    int[] p2={34,45,23,12};
    int num=12;
 
    if(num==p2[0] || num==p2[1] || num==p2[2] || num==p2[3]){
        System.out.println("in array!!");
    }
    else{
        System.out.println("not in array!!");
    }
    
    //problem3....
    float avg=(sum)/p1.length;
    System.out.println(avg);
    
    //problem4....................
        int [][] matrix1 = {{1, 2, 3},
                           {4, 5, 6}};
        int [][] matrix2 = {{2, 6, 13},
                           {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
                           
    for (int i=0;i<matrix1.length;i++){ 
            for (int j=0;j<matrix1[i].length;j++) { 
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
           System.out.println(""); 
        }
        
        //problem5...........
        int[] justarray={34,56,78,56,2995};
        
        for(int a=justarray.length-1;a>=0;a--){
            System.out.print(justarray[a]+" ");
        }
        
        //problem6................
        int max=0;
        for(int element:justarray){
            if(element>max){
              max=element;
            }
        }
        System.out.println("the maximum element is::"+max);
	}
}
