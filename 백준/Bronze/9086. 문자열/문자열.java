import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = new String[n];
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			strArr[i] = str.charAt(0) + "" + str.charAt(str.length()-1);
		}
		for(int i=0; i<n; i++) {
			System.out.println(strArr[i]);
		}
	}

}