import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] vasya = new int[n][n];
        int[][] petya = new int[n][n];
        int counter = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                counter++;
                vasya[i][j] = counter;
                petya[j][i] = counter;
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(vasya[i][j] == petya[i][j]) {
                    System.out.print(vasya[i][j] + " ");
                }
            }
        }
        /*
        System.out.println();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(vasya[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(petya[i][j] + " ");
            }
            System.out.println();
        }
           */


    }
}