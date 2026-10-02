package Exercice5;

public class AddMatrices {
    public static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixAdd( int[][] a, int[][] b){
        int[][] matrixSum= new int[a.length][a[0].length];
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                matrixSum[i][j]=a[i][j]+b[i][j];
            }
        }
        return matrixSum;
    }
    public static void main(){
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        System.out.println("The matrix sum of these two matrices is: ");
        AddMatrices.printMatrix(AddMatrices.matrixAdd(a,b));
    }
}
