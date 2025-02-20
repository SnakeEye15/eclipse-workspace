package practice;
public class PrintMatrix {
	//Contains method to print the element of matrix.
	public static void printMatrix(int [][] matrix) {
		int rowSize=matrix.length;
		int colSize=matrix[0].length;
		
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
