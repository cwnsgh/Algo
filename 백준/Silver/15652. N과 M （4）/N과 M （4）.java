import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 재료를 준비를 했다.
	public static int[] arr;
	public static int N;
	public static int M;
	public static int[] sel;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		sel = new int[M];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		combination(0, 0);
	}
	
	//내가 뽑은거 말고 나머지를 뽑아야함
	// idx : 기본의 index
	// sidx : sel의 index
	public static void combination(int idx, int sidx) {
		// 기저파트
		if (sidx == M) {
			for(int i = 0 ; i <M;i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
//			System.out.println(Arrays.toString(sel));
			return;
		}
		
		if (idx == N)
			return;
		// 재귀파트
		sel[sidx] = arr[idx]; // 해당 인젝스 넣어보자.
		combination(idx, sidx + 1); // idx 번째 뽑은거
		combination(idx + 1, sidx); // idx 번째 안뽑은거

	}
}