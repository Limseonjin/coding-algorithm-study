package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MaxAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        Map<String,Integer> strList = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (!strList.containsKey(s)){
                strList.put(s,1);
            }else{
                strList.replace(s,strList.get(s)+1);
            }
        }
        int maxValue = 0;
        String maxAlaph="";
        for (String s : strList.keySet()) {
            int value = strList.get(s);
            if (maxValue < value){
                maxAlaph = "";
                maxValue = value;
                maxAlaph += s;
            }else if(maxValue == value) {
                maxAlaph += s;
            }
        }
        if (maxAlaph.length() > 1)
            System.out.println("?");
        else
            System.out.println(maxAlaph);

    }
}
