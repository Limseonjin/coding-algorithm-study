package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str.length());

    }
}
