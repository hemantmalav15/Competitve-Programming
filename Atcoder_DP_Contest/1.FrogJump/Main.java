import java.io.*;
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		solve();
		out.close();
	}

	public static void solve() {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
		
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		int ans = frogJump(arr, 0, n, dp);
		out.println(ans);
	}

	private static int frogJump(int[] arr, int idx, int n, int dp[]) {
        if (idx == n - 1)
            return 0;
		
        // we can take either 1 or 2 jumps from an idx but check if it is possible to take 2 jumps from idx
		if(dp[idx] != -1) {
			return dp[idx];
		}
		int left = Math.abs(arr[idx] - arr[idx + 1]) + frogJump(arr, idx + 1, n, dp);
		int right = Integer.MAX_VALUE;
		
		if(idx + 2 < n)right = Math.abs(arr[idx] - arr[idx + 2]) + frogJump(arr, idx + 2, n, dp);
		return dp[idx] = Math.min(left, right);
	}
}

/*
 * Strategy (Keep it super simple)
 */