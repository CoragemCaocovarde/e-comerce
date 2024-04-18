import java.util.Scanner;
public class ProdutoSimples {
    public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
      int x;
      x = scanner.nextInt();
      int y;
      y = scanner.nextInt();
      int PROD = x * y;
        System.out.println("PROD = "+PROD);
    }
}