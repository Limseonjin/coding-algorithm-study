package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input="";

        while((input = br.readLine()) != null && !input.isEmpty()) {
            sb.append(input);
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

    }
}
