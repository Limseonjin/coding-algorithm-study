package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAndFinal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            if (str.length()==1){
                System.out.println(str+""+str);
                continue;
            }
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }

    }
}
