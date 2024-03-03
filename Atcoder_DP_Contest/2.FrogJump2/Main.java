import java.io.*;
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t = 1;
//		t = sc.nextInt();
//		for (int tests = 0; tests < t; tests++)
			solve();
		out.close();
	}

	public static void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
		
		int dp[] = new int[n];
		Arrays.fill(dp, -1);
		int ans = frogJump(arr, 0, k, n, dp);
		out.println(ans);
	}

	private static int frogJump(int[] arr, int idx, int k, int n, int dp[]) {
		if(idx == n - 1)return 0;
		
		if(dp[idx] != -1) {
			return dp[idx];
		}
		
		int ans = Integer.MAX_VALUE;
		// we can take upto K jumps but from an idx we can not take K jumps always so we have to careful when making jumps
		for(int jump = 1; jump <= k && jump + idx < n; jump++) {
			ans = Math.min(ans, Math.abs(arr[idx] - arr[idx + jump]) + frogJump(arr, idx + jump, k, n, dp));
		}
		return dp[idx] = ans;
	}
}

/*
 * Strategy (Keep it super simple)
 */