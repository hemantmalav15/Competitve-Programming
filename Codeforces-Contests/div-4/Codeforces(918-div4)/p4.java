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
public class p4 {
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e')return true;
		return false;
	}
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
			int n = sc.nextInt();
            String s = sc.next();
			
            /**
             * as we know syllables will be in the form of CV or CVC so we will be starting from the 
             * end of the string and will be checking if curr char is (C type) then we have to add
             * 3 len string into ans otherwise 2 length string into our ans then wll reverse that
             */
			List<String> res = new ArrayList<>();
			int i = n - 1;
			while(i >= 0) {
				char ch = s.charAt(i);
				if(isVowel(ch)) {
					res.add(s.substring(i - 1, i + 1));
					i = i - 2;
				}
				else {
					res.add(s.substring(i - 2, i + 1));
					i = i - 3;
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int j = res.size() - 1; j >= 0; j--) {
				if(j != 0) {
					sb.append(res.get(j));
					sb.append(".");
				}
				else {
					sb.append(res.get(j));
				}
			}
			System.out.println(sb.toString());
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