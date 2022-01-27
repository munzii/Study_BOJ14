import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P15649 {
	
	public static int[] arr;
	public static boolean[] visit;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n,m,0);
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	private static void dfs(int n, int m, int depth) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if(depth == m) {
			for(int val : arr) {
				bw.write(val + " ");
			}
			bw.write('\n');
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(n,m,depth+1);
				visit[i] = false;
			}
		}
	}

}