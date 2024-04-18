import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double r = scanner.nextDouble();
        double calculo = r * r * n;
            System.out.printf("A= %.2f\n",calculo);
    }
}
