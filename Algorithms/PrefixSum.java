import java.util.Scanner;

class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix_sum[] = new int[n];

        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        // finding sum in range from (L-R) in O(1)
        int l = sc.nextInt();
        int r = sc.nextInt();

        if (l == 0) {
            System.out.println(prefix_sum[r]);
        }
        else {
            System.out.println(prefix_sum[r] - prefix_sum[l - 1]);
        }
    }
}