package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStart17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        for (int i = 0; i < row-1; i++){
            System.out.print(" ".repeat((row-1)-i));
            System.out.print("*");
            if (i != 0){
                System.out.print(" ".repeat((2*i-1)));
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.print("*".repeat((2*row)-1));
    }
}
