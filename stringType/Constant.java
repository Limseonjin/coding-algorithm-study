package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        StringTokenizer tokenizer = new StringTokenizer(text);
        String n1 = tokenizer.nextToken();
        String n2 = tokenizer.nextToken();

        String newN1="" , newN2= "";
        for (int i = n1.length()-1; i >= 0; i--) {
            newN1 += n1.charAt(i);
        }
        for (int i = n2.length()-1; i >= 0; i--) {
            newN2 += n2.charAt(i);
        }
        int num1 = Integer.parseInt(newN1);
        int num2 = Integer.parseInt(newN2);
        System.out.println(Math.max(num1, num2));


    }
}
