import java.util.ArrayList;

import java.util.Arrays;
public class binarysearch {
    public static void main(String[] args) {
        int a []= {2,5,8,9,12,45,56};
        int target=10;
        Arrays.sort(a);
        System.out.println("the sorted array is "+Arrays.toString(a));
        int ans = search(a,target);
        System.out.println(ans);
    }
    static int search(int a[],int target){

        int start=0;
        int end = a.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target< a[mid]){
                end=mid -1;

            }
            else if (target> a[mid]){
                start = mid +1;

            }
            else{
                return mid;
            }

        }
        return end;

    }
}
