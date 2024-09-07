public class minarray {
    public static void main(String[] args) {
    int a[]={12,34,56,78,89,92,12,3,45,87};
        int ans =minimum(a);
        System.out.println(ans);

    }
    static int minimum(int a[]){
        int ans = a[0];
                for(int i = 0 ;i <a.length;i++){
                    if(a[i]<ans){
                        ans = a[i];

                    }

                }
                return ans;
    }
}
