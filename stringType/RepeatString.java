package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String text = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(text);
            int R = Integer.parseInt(tokenizer.nextToken());
            String S = tokenizer.nextToken();
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.printf("%s",S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
