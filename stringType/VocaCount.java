package stringType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class VocaCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        
        String[] voca = sentence.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(voca));
        arrayList.removeIf(s -> s.isEmpty());

        System.out.println(arrayList.size());

    }
}
