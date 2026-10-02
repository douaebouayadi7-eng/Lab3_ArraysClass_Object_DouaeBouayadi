package Exercice2;

public class ReverseArray {
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] reverse(int[] arr){
        for (int i=0; i<arr.length/2; i++){
            int temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        return arr;
    }
    public static void main(){
        int[] arr= {1, 2, 3, 4, 5};
        System.out.println("The content of the array before reverse is: ");
        ReverseArray.printArray(arr);
        ReverseArray.reverse(arr);
        System.out.println("The content of the array after reverse is: ");
        ReverseArray.printArray(arr);
    }
}
