package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String STAR = "*";
        int b = n;
        for (int i = 1; i < n+1; i++) {
            System.out.print(" ".repeat(b-1)+STAR.repeat(2*i-1));
            System.out.println("");
            b--;
        }
        for (int i =n-1; i > 0; i--) {
            System.out.print(" ".repeat(b+1)+STAR.repeat(2*i-1));
            System.out.println("");
            b++;
        }
    }

}
