package Exercice7;

public class StandarDev {
    public static double stdev( int[] a){
        int sum=0;
        double temp=0;

        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }

        double average= (double) sum/a.length;

        for (int i=0; i<a.length; i++){
            temp+= Math.pow(a[i]-average, 2);
        }
        double stdev= Math.pow(temp/(a.length-1), 0.5);
        return stdev;
    }
    public static void main(String[] args){
        System.out.println("The array passed contains the elements: ");
        int[] a= {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nIts standard deviation is equal to: "+ StandarDev.stdev(a));


    }
}

