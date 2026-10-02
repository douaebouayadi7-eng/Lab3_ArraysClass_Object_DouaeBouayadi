package Exercice1;

public class DescSort {

    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortIntegers( int[] arr){
        int[] sortedArr= new int[arr.length];

        for (int i=0; i<arr.length; i++){
            sortedArr[i]=arr[i];
        }
        for (int pass = 0; pass < sortedArr.length - 1; pass++) {

            for (int i=0; i<arr.length-1; i++) {
                int temp = sortedArr[i];
                if (sortedArr[i + 1] > sortedArr[i]) {
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                }
            }
        }
        return sortedArr;
    }
    public static void main(){
        int[] arr= {106, 26, 81,5, 15};
        System.out.println("The content of the array before sorting is: ");
        DescSort.printArray(arr);
        int[] sorted=DescSort.sortIntegers(arr);
        System.out.println("The content of the array after sorting is: ");
        DescSort.printArray(sorted);
    }
}
