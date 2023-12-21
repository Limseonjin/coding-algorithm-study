package deepStep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        double avgScore = 0;

        ArrayList<String> stringScore = new ArrayList<>(
                List.of("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F")
        );
        ArrayList<Double> doubleScore = new ArrayList<>(
                List.of(4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0)
        );
        HashMap<String, Double> scoreCard = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            scoreCard.put(stringScore.get(i), doubleScore.get(i));
        }
        ArrayList<String[]> gradeCard = new ArrayList<>();

        while ((str = br.readLine()) != null && !str.isEmpty()) {
            String[] s = str.split(" ");
            for (Map.Entry<String, Double> sc : scoreCard.entrySet()) {
                if (sc.getKey().equals(s[2])) {
                    s[2] = "" + sc.getValue();
                }
            }
            gradeCard.add(s);
        }
        double avgScoreSum = gradeCard.stream()
                .filter(s -> !s[2].equals("P"))
                .mapToDouble(s -> {
                    double s1 = Double.parseDouble(s[1]);
                    double s2 = Double.parseDouble(s[2]);
                    return s1 * s2;
                })
                .reduce(0, Double::sum);

        double totalGrade = gradeCard.stream()
                .filter(s -> !s[2].equals("P"))
                .mapToDouble(s -> Double.parseDouble(s[1]))
                .reduce(0, Double::sum);
        avgScore = avgScoreSum/totalGrade;
        System.out.println(avgScore);
    }
}
