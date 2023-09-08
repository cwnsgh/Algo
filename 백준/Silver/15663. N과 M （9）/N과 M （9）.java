import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		ans = new int[N];
		set = new LinkedHashSet<>();
		st = new StringTokenizer(br.readLine());
        visit = new boolean[N];
        
        for(int i = 0; i < N; i++) {
        	ans[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(ans);
		dfs(0);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
		    System.out.println(iter.next()); // 1 2 3
		}
	}
	
	
	public static int[] arr,ans;
	public static int N, M;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static LinkedHashSet<String> set;
 
	public static void dfs(int depth) {
		if (depth == M) {
			StringBuilder sb = new StringBuilder();
			for (int val : arr) {
				sb.append(val + " ");
			}
//			System.out.println(sb.toString());
			set.add(sb.toString());
			sb.append('\n');
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = ans[i];
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}
}