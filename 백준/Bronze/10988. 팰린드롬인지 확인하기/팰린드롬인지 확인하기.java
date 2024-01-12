import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a = 0;
    	StringBuffer s = new StringBuffer(br.readLine());
    	if (s.toString().equals(s.reverse().toString())) {
			a = 1;
		}
    	System.out.println(a);
    }
}
