package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v = input.nextInt();
        int n = input.nextInt();

        double k = (v * 12.0) / n;

        System.out.println(k);
    }
}