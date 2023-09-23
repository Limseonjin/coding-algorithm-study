package secondArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pluse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] a = new int[N][M];
        int[][] b = new int[N][M];

        for (int i = 0; i < N; i++) {
            String K = br.readLine();
            st = new StringTokenizer(K);
            for (int j = 0; j < M; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            String K = br.readLine();
            st = new StringTokenizer(K);
            for (int j = 0; j < M; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
                System.out.println(a[i][j]+b[i][j]);
            }
        }


    }
}
