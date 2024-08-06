import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cCount = 1, pCount = 0;

		while (true) {
			if (x <= pCount + cCount) {

				if (cCount % 2 == 1) {
					System.out.print((cCount - (x - pCount - 1)) + "/" + (x - pCount));
					break;
				}

				else {
					System.out.print((x - pCount) + "/" + (cCount - (x - pCount - 1)));
					break;
				}

			} else {
				pCount += cCount;
				cCount++;
			}
		}
	}
}