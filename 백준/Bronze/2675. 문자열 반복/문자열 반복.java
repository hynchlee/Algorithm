import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String[] sArr = br.readLine().split(" ");
			int R = Integer.parseInt(sArr[0]);
			String str = sArr[1];
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}