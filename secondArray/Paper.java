package secondArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Paper {
    /*
        1. 색종이 갯수 paper
        2. 색종이 위치 -> x=3, y=7 / 5,2 > [[3,7],[5,2]]
        3. 겹친 색종이 위치 -> [[5,7]]

        --
        1.paper만큼 입력 받고 색종이를 붙이는 반복행동이 필요
        2.색종이가 겹칠 경우 겹치는 만큼 넓이 감소
         - 배열을 x 기준으로 정렬
         - (n-1 - n)해서 겹치는 색종이 넓이 구하기 .
         - 겹치는 색종이들 새로 저장
        3.3번이상 겹칠 경우 넓이 감소 X <- 겹친적이 있는지 확인해야함
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paper = Integer.parseInt(br.readLine());
        int total = paper*100;
        int[][] board = new int[100][100];
        for (int i = 0; i < paper; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10 ; k++) {
                    board[(x+j)][(y+k)] += 1;
                }
            }
        }
        int cnt = 0;
        for (int[] x : board) {
            for (int j = 0; j < 100; j++) {
                if (x[j] > 1){
                    cnt+=x[j]-1;
                }
            }
        }

        System.out.println(total-cnt);
    }
}
