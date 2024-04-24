class ch_06b_multidimension
{
	public static void main(String[] args) {
		System.out.println("multi-dimension arrays:");
		
		int[][] matrix =new int [2][2];
		   
		matrix[0][0]=23;
		matrix[0][1]=90;
		matrix[1][0]=89;
		matrix[1][1]=78;
		
		for(int i=0; i<matrix.length ;i++){
		    for(int j=0;j<matrix[i].length;j++){
		        System.out.printf("%d ",matrix[i][j]);
		    }
		    System.out.print("\n");
		}
	}
}
