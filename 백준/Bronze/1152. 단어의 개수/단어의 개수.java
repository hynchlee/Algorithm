import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.println(st.countTokens());
//		String str = br.readLine().trim();
//		String[] sArr = str.split(" ");
//		int len = sArr.length;
//		System.out.println(len);
	}

}