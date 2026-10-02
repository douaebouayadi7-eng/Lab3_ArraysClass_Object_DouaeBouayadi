package Exercice3;

public class JaggedArray {
    public static void print2dArray(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] jaggedArr(){
        int[][] arr= new int[5][];
        for (int i=0; i<5; i++){
            arr[i]= new int[i+1];
            for (int j=0; j<arr[i].length;j++){
                arr[i][j]=j+1;
            }
        }
        return arr;
    }
    public static void main(){
        JaggedArray.print2dArray(JaggedArray.jaggedArr());
    }

}
