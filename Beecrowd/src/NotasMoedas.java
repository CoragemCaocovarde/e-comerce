
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double N;
        double nota100,nota50,nota20,nota10,nota5,nota2;
        int qnota100,qnota50,qnota20,qnota10,qnota5,qnota2;
        
        N = scan.nextDouble();
        nota100 = 100;
        nota50 = 50;
        nota20 = 20;
        nota10 = 10;
        nota5 = 5;
        nota2 = 2;
        if (0 <= N && N <= 1000000.00) {
        N= scan.nextDouble();
        }
        
    }
}
