package Matemáticos;
import java.util.Scanner;

    public class Media2 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double A,B,C;
      A = scanner.nextDouble();
      if(A<0 && 10<A){
      A=scanner.nextDouble();
      }
      B = scanner.nextDouble();
      if(B<0 && 10<B){
      B=scanner.nextDouble();
    }
      C = scanner.nextDouble();
      if(A<0 && 10<A){
      C=scanner.nextDouble();
      }
      double pesoA,pesoB,pesoC;
      pesoA = 2.0;
      pesoB = 3.0;
      pesoC = 5.0;
      double MEDIA;
      MEDIA = ((A *pesoA) + (pesoB * B) + (pesoC * C))/10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
      
  }
}
