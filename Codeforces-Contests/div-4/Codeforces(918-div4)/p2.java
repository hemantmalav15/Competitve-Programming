/* In this ques we are given 3 x 3 matrix containing only (A,B,C) each row will contain (A,B,C) once and 
   each col will also contain (A,B,C) 
   ex [
       [A, B, C],
       [B, A, C],
       [C, B, A]
      ]
      like this but in this one char is replaced with (?) we have to find which char it is
*/

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
public class p2 {
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
			
            // so there should be 3A, 3B, 3C so we are just simply counting there occurences
			int countA = 0, countB = 0, countC = 0;
			for(int i = 0; i < 3; i++) {				
				String s = sc.nextLine();
				for(int j = 0; j < 3; j++) {					
					if(s.charAt(j) == 'A')countA++;
					else if(s.charAt(j) == 'B')countB++;
					else if(s.charAt(j) == 'C')countC++;
				}
			}
			if(countA == 2)System.out.println('A');
			else if(countB == 2)System.out.println('B');
			else if(countC == 2)System.out.println('C');
		}
	}
	
	/*============ This is for fast I/O ==============*/
	
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