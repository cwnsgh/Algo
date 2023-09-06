import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Size = sc.nextInt();
		arr = new int[Size][Size];
		for (int i = 0; i < Size; i++) {
			for (int j = 0; j < Size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		bluecount(Size,0,0);
		whitecount(Size,0,0);
		System.out.println(white);
		System.out.println(blue);
	}

	static int blue, white;
	static int arr[][];

	static void bluecount(int Size, int x, int y) {
		if (Size < 1) {
			return;
		}
		int sum = 0;
		int bluemax = Size * Size;
		for (int i = x; i < x + Size; i++) {
			for (int j = y; j < y + Size; j++) {
				sum += arr[i][j];
			}
		}
		if (sum == bluemax) {
			blue++;
			return;
		}
		int next = Size / 2;
		bluecount(next, x, y);
		bluecount(next, x + next, y);
		bluecount(next, x, y + next);
		bluecount(next, x + next, y + next);
	}

	static void whitecount(int Size, int x, int y) {
		if (Size < 1) {
			return;
		}
		int sum = 0;
//	 int whitemax= 0;
		for (int i = x; i < x + Size; i++) {
			for (int j = y; j < y + Size; j++) {
				sum += arr[i][j];
			}
		}
		if (sum == 0) {
			white++;
			return;
		}
		int next = Size / 2;
		whitecount(next, x, y);
		whitecount(next, x + next, y);
		whitecount(next, x, y + next);
		whitecount(next, x + next, y + next);
	}
}