// given 3 Integers (a, b, c) two of them are equal and one is different

import java.io.*;
import java.util.*;

class Pair {
	int first;
	int second;

	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
}
public class p1 {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		//		 List<Long> arr = new ArrayList<>();
		//		 arr.add(new Pair(sc.nextInt(), sc.nextInt()));
		//		for (int i = 0; i < n; i++) {
		//			arr.add(sc.nextLong());
		//		}
		//		Collections.sort(arr, (a, b) -> Integer.compare(a.second, b.second));

		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			// as we know xor of two same no is zero so we will be left with only single no
			System.out.println(a ^ b ^ c);
		}
	}
	/* This is for fast I/O */
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}