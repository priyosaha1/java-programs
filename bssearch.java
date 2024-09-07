public class bssearch{
    public static void main(String[] args) {
    float a[]={1.2f,1.5f,1.8f,2.00f,2.6f,3.0f,4.8f,6.4f,19.9f,85.6f,78.44f};
    float target=78.44f;
    float ans=bs(a,target);
        System.out.println("The "+target+" element is in index no:"+ans);
    }

    static float bs(float a[], float target) {
        int start = 0;
        int end = a.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return start;
    }
}
