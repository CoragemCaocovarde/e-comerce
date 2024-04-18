import java.util.Scanner;

public class Pneu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M;
        M = scanner.nextInt();
        for (int i = 0;M<0 || M>40 ; i++) {
            M=scanner.nextInt();
        }
        int N;
        N = 30;
        int resultado = M - N;
        System.out.println(""+resultado);
    }
}