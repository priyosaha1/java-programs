public class ls {
    public static void main(String[] args) {
        int a[] = {12, 45, 56, 23, 78, 54, 47};
        int target = 56;
        int ans=s(a,target);
        System.out.println(ans);

    }

    static int s(int a[], int target) {
        if (a.length == 0) {
            return -1;

        }

        for (int i = 0; i < a.length; i++) {
            int e=a[i];
            if(e==target){
                return i;
            }
        }

    return -1;
    }
}
