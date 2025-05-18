public class MatrixRotation {
    public static void transpose(int[][] mat){
        int n= mat.length;
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    public static void reverse(int[][] mat)
    {  int n= mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
       int[][] matrix = {
    {1, 0, 3},
    {4, 9, 6},
    {7, 8, 9}
};
         
         for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
              }
              System.out.println();}
              transpose(matrix);
              reverse(matrix);
        for (int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
              }
              System.out.println();
         }
         




    }
}
