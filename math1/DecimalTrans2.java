package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DecimalTrans2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        Map<Character, Integer> stringValue = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            stringValue.put((char) (65+i),10+i);
        }
        int num = Integer.parseInt(s[0]);
        int decimal = Integer.parseInt(s[1]);
        int pow = 0;
        ArrayList<String> trans = new ArrayList<>();
        while (num > 0){
            pow = num%decimal;
            num /= decimal;
            if (stringValue.containsValue(pow)){
                for (Character key : stringValue.keySet()) {
                    if (pow == stringValue.get(key)) {
                        trans.add(String.valueOf(key));
                        break;
                    }
                }
            }else{
                trans.add(String.valueOf(pow));
            }
        }
        Collections.reverse(trans);
        System.out.println(String.join("",trans));
    }
}
