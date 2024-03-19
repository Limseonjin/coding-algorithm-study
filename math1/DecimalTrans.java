package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DecimalTrans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        Map<Character, Integer> stringValue = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            stringValue.put((char) (65+i),10+i);
        }
        String code = s[0];
        int decimal = Integer.parseInt(s[1]);
        int total = 0;
        for (int i =0; i <code.length(); i++) {
            char a = code.charAt(code.length()-1-i);
            int num = 0;
            if (stringValue.containsKey(a)){
                num = stringValue.get(a);
            }else{
                num = Integer.parseInt(String.valueOf(a));
            }
            total += (int) (num * Math.pow(decimal, i));
        }
        System.out.println(total);

    }
}
