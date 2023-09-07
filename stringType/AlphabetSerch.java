package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetSerch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String[] alph = {"a","b","c","d","e","f","g",
                "h","i","j","k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z"};
        int[] num = new int[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        for (int j = 0; j < alph.length; j++) {
            if (!word.contains(alph[j]))
                continue;
            for (int i = 0; i < word.length(); i++) {
                if (alph[j].equals(String.valueOf(word.charAt(i)))){
                    num[j] = i;
                    break;
                }
            }
        }

        for(int i : num){
            System.out.printf("%d ",i);
        }
    }
}
