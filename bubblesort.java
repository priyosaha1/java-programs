//import java.security.spec.RSAOtherPrimeInfo;
//import java.util.Arrays;
//
//public class bubblesort {
//    public static void main(String[] args) {
//    int a[]={56,45,78,12,23,2,9,18,64};
//    bubble(a);
//        System.out.println(Arrays.toString(a));
//    }
//    static void bubble(int a[]){
//
//        for (int i =0;i<a.length;i++){
//            for (int j=1;j< a.length-i;j++){
//                if (a[j]<a[j-1]){
//                    int temp = a[j];
//                    a[j]=a[j-1];
//                    a[j-1]= temp;
//                    //swaped
//                }
//            }
//        }
//
//
//    }
//}
public class bubblesort {
    public static void main(String[] args) {
        String[] arr = {"apple", "cherry","banana", "date", "grape"};

        bubbleSortString(arr);

        System.out.println("Sorted strings:");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void bubbleSortString(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Flag to optimize the algorithm by breaking early if no swaps are made in a pass
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap them if they are in the wrong order
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
