package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Croatea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        List<String> croList = new ArrayList<>(
                List.of("dz=","c-", "c=", "d-", "lj", "nj", "s=", "z=")
        );
        int total = 0;

        for (String s : croList) {
            while (true) {
                boolean flag = true;
                if (str.contains(s)){
                    System.out.println("s = " + s);
                    int index = sb.indexOf(s);
                    for (int i = index; i < index+s.length(); i++) {
                        sb.deleteCharAt(i);
                        sb.replace(i,i,"0");
                    }
                    total++;
                    flag = false;
                }
                str = sb.toString();
                if (flag) break;
            }
            System.out.println("str = " + str);
        }

        for (int i = 0; i < str.length();) {
            if (String.valueOf(str.charAt(i)).equals("0"))
                sb.deleteCharAt(i);
            else{
                i++;
            }
            str = sb.toString();
        }
        System.out.println(total+sb.length());


    }
}
