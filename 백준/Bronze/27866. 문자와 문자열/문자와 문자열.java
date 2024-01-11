import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
//		String s = "Sprout";
//		int num = 6;
//		
//		char str = s.charAt(num-1);
//		
//		System.out.println(str);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int n = Integer.parseInt(br.readLine())-1;
		br.close();
		
		System.out.println(S.charAt(n));
	}

}