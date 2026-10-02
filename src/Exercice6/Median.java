package Exercice6;

public class Median {
    public static int median(int[] arr ){
        // We need to sort the array first
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i=0; i<arr.length-1; i++) {
                int temp = arr[i];
                if (arr[i+1] < arr[i]) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        //Now we find the median
        int med;
            if(arr.length %2== 0){
                med= (arr[arr.length/2-1]+arr[arr.length/2])/2;
            }else{
                med= arr[(arr.length-1)/2];
            }
        return med;
    }
    public static void main(String[] args){
        int[] oddLength={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] evenLength={42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println("The content of the first array is: ");
        for (int i=0; i<oddLength.length; i++){
            System.out.print(oddLength[i]+" ");
        }
        System.out.println("\n Its median is: "+ Median.median(oddLength));
        System.out.println("The content of the second array is: ");
        for (int j=0; j<evenLength.length; j++){
            System.out.print(evenLength[j]+" ");
        }
        System.out.println("\n Its median is: "+ Median.median(evenLength));
    }
}
