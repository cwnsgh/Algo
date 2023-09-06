import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[]arr ;
	public static int[]asw ;
	public static boolean[]visit;
	public static StringBuilder sb =new StringBuilder();
	
	static void dfs(int N, int M , int depth) {
		if(depth==M) {
			for(int a :arr) {
				sb.append(a).append(' ');
			}sb.append('\n');
			return;
		}
		
		for(int i  = 0 ; i <N ; i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=asw[i];
				dfs(N,M,depth+1);
				visit[i]=false;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int N =Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		
		visit = new boolean[N];
		arr= new int[M];
		asw =new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<N; i++) {
			asw[i]=Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(asw);
		dfs(N,M,0);
		System.out.println(sb);
	
	}
}