import java.util.Scanner;

public class MatrixOperations{

private static int calculateTrace (int[][] matrix){
 int trace 0; 
 for(int i=0; I<matrix. Length; i++) 
 {
    trace+= mahix[i][j]; 
  }
   reterun trace;

}

private static int[][] transposeMtrix(int[][] matrix)
{
    int rows=matrix.length;
    int cols=matrix[0].length;
    int[][] transposed=new int[cols][rows];
    for(int i=0;i<rows;i++)
    {
        for(int j0;j<cols;j++)
        {
            transposed[j][i]=matrix[i][j];
        }
    }
    return transposed;
}
private static void printMatrix(int[][] matrix)
{
  for(int[] row:matrix)
  {
    for(int elem:row)
    {
        System.out.print(elem+"");
    }
    System.out.println();

  } 
  public static void main(String[] args) 
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter rows&columno");
    int rows=scanner.nextInt();
    int cols=scanner.nextInt();
    int[][]matrix=new int[rows][cols];
    System.out.println("enter matrix");
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
          matrix[i][j]=scanner.nextInt();
        }
    }
    if(rows==cols)
    {
        System.out.println("Trace:"+calculateTrace(matrix));
    }
    System.out.println("Transpose");
    printMatrix(transposeMatrix(matrix));
  }
}
}

