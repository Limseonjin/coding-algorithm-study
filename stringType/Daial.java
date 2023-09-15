package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Daial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] alpha = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        int totalTime = 0;
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < input.length(); j++) {
                if (alpha[i].contains(String.valueOf(input.charAt(j)))){
                    totalTime += i+3;
                }
            }
        }
        System.out.println(totalTime);



    }
}
