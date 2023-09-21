package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length() - 1;

        StringBuilder str2= new StringBuilder();

        for (int i = len; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        System.out.println(str.contentEquals(str2) ? 1 : 0);
    }
}
