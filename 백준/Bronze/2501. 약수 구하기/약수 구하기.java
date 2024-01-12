import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sArr = br.readLine().split(" ");
		int a = Integer.parseInt(sArr[0]);
		int b = Integer.parseInt(sArr[1]);
		
		int cnt = 0;
		for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				cnt++;				
			}
			if(cnt == b) {
				System.out.println(i);
				break;
			}
		}
		if(cnt < b)
		System.out.println(0);
	}
}