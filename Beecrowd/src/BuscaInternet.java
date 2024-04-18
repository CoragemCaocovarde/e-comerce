import java.util.Scanner;

public class BuscaInternet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int link1,link2,link3;
        link3 = scan.nextInt();
        link2 = link3 * 2;
        link1 = link2 + link2;
        System.out.println(""+link1);
    }
}
