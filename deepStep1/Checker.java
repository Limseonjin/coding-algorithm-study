package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Checker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int groupVoca = 0;

        for (int i = 0; i < loop; i++) {
            boolean isGroup = true;
            String str = br.readLine()+" ";

            //str의 길이가 1이면 바로 그룹단어로 취급하고 이번 for문 종료
            if (str.length()==2){
                groupVoca++;
                continue;
            }
            ArrayList<String> ar = new ArrayList<>();

            for (int j = 0; j < str.length()-1; j++) {
                if (str.charAt(j) != str.charAt(j+1))
                    ar.add(String.valueOf(str.charAt(j)));
            }
            System.out.println("ar = " + ar);
            if (ar.size() >2){
                for (String s : ar) {
                    ArrayList<String> ar2 = new ArrayList<>(ar);
                    ar2.remove(s);
                    System.out.println("ar2 = " + ar2);
                    if (ar2.contains(s)){
                        isGroup = false;
                        break;
                    }
                }
            }
            if (isGroup)
                groupVoca++;
        }
        System.out.println(groupVoca);
    }
}
