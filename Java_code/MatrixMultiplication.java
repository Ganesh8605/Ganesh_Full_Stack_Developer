class MatrixMultiplication
{
	public static void main(String[] args) 
	{
		System.out.println("The given matrix A :");
		int[][]a= {
			{8,3,6},
			{4,3,1},
			{8,4,4},
	      };
			int [][]b={
				{4,3,2},
				{2,1,6},
				{1,4,1},
			  };
				
				for (int i=0;i<a.length ;i++ )
				{
					for (int j=0;j<a[i].length ;j++ )
					{
						System.out.print(a[i][j] +" ");
					}
					System.out.println(" ");
				}
				System.out.println("--------------------------------> ");
				System.out.println("The given matrix B :");
				for (int i=0;i<b.length ;i++ )
				{
					for (int j=0;j<b[i].length ;j++ )
					{
						System.out.print(b[i][j] +" ");
					}
					System.out.println(" ");
				}
				System.out.println("--------------------------------> ");
				System.out.println("The Multiplication matrix A*B :");
				int [][]res=new int[a.length][b.length];
					for (int i=0;i<res.length ;i++ )
					{
					for (int j=0;j<res[i].length ;j++ )
					{
						res[i][j]=a[i][j]*b[i][j];
						System.out.print(res[i][j]+"  ");
					}
					System.out.println();
					}
				
}
}
