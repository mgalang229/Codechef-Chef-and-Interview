import java.io.*;
import java.util.*;

public class Main {
	
	private static FastReader in;
	
	public static void main(String[] args) {
		in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solver();
		}
	}
	
	static class Solver { 
		Solver() {
			
			// input
			int n = in.nextInt();
			
			// to get the maximum sum, generate all the divisors of n
			ArrayList<Integer> divisors = new ArrayList<Integer>();
			for(int i = 1; i <= (int) Math.sqrt(n); i++) {
				if(n % i == 0) {
					divisors.add(i);
					int otherDivisor = n / i;
					if(otherDivisor != i) {
						divisors.add(otherDivisor);
					}
				}
			}
			
			// calculate the sum of all the divisors
			long sum = 0;
			for(Integer x : divisors) {
				sum += x;
			}
			
			// output
			System.out.println(sum);
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
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
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
