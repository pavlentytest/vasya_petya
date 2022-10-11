
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fullsum = 0;
        int actualsum = 0;
        for(int i=1;i<=n;i++) {
            fullsum += i; // fullsum = fullsum + i
        }
        for(int i=0;i<n-1;i++) {
            int buf = scanner.nextInt();
            actualsum += buf;
        }
        System.out.println(fullsum - actualsum);
    }
}