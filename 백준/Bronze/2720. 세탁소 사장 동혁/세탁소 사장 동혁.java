import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			int c = Integer.parseInt(br.readLine());
			int Q = c/q;
			c = c%q;
			int D = c/d;
			c = c%d;
			int N = c/n;
			c = c%n;
			int P = c/p;
			c = c%p;
			
			sb.append(Q).append(" ")
			.append(D).append(" ")
			.append(N).append(" ")
			.append(P).append(" \n");
		}
		
		System.out.println(sb);
	}
}