package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] whitePiec = {1,1,2,2,2,8};
        int[] checkPiec = new int[6];
        StringTokenizer tokenizer = new StringTokenizer(input);

        for (int i = 0; i < checkPiec.length; i++) {
            checkPiec[i] = Integer.parseInt(tokenizer.nextToken());

            whitePiec[i] = whitePiec[i]-checkPiec[i];
        }
        for (int i : whitePiec) {
            System.out.print(i+" ");
        }

    }
}
