package test;

import java.util.Scanner;

public class GearsOfWar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        in.nextLine();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            System.out.println(n % 2 == 0 ? "Yes" : "No");
        }
        in.close();
    }
}
