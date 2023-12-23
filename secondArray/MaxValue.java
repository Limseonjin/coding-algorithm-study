package secondArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int max = -1;
        int one = 0, two = 0;
        int[][] nList = new int[9][9];
        for (int i = 0; i < 9; i++) {
            input = br.readLine();
            String[] s = input.split(" ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(s[j]);
                nList[i][j] = num;
                if (max < num){
                    max = num;
                    one = i+1;
                    two = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(one+" "+two);
    }
}
