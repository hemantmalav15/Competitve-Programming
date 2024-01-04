public class Binary_Search_Variant {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        int l = 0;
        int r = n - 1;
        int target = 10;
        // works in all types of binary search
        // 0,0,0,0,0,0,1,1,1,1 (at the end lo will be pointing to last 0 and hi will be pointing to first 1)
        while (r > l + 1) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (arr[r] == target) {
            System.out.println(r);
        }
        else {
            System.out.println(-1);
        }
    }
}
