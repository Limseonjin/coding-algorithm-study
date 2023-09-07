package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddNumWithString {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(total);
    }
}
