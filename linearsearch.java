import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        //int a[] = {12, 23, 45, 56, 78, 79};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the arrays size :");
        int s= sc.nextInt();
        int a[]=new int[s];
        System.out.println("enter the arrays element:");
        for(int i = 0;i<s;i++) {
            a[i] = sc.nextInt();
        }
        int target =79;
        int ans = search(a,target);
        System.out.println("The index of the serach index is " +ans);
    }

    static int search(int a[],int target){
//        int a[] = {12, 23, 45, 56, 78, 79};
        if (a.length==0){
            return -1;

        }
        for (int index =0; index<a.length;index++){
            int elemnt =a[index];
            if(elemnt==target){
                return index;

            }

        }
        return -2;
    }
}

