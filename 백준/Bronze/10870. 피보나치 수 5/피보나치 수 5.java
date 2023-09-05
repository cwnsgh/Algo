import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
		}
		else if (N == 0) {
			System.out.println(0);
		}else {
			arr = new int[N + 1];
			arr[0] = 0;
			arr[1] = 1;
			System.out.println(fac(2));
		}
	}

	static int N;
	static int[] arr;

	public static long fac(int b) {

		arr[b] = arr[b - 2] + arr[b - 1];

		if (b == N)
			return arr[N];

		else {
			return fac(b + 1);

		}
	}
}