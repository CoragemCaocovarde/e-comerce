import java.util.Scanner;

public class Media1 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double A,B;
      A = scanner.nextDouble();
      if(A<0 && 10<A){
      A=scanner.nextDouble();
      }
      B = scanner.nextDouble();
      if(B<0 && 10<B){
      B=scanner.nextDouble();
    }
      double pesoA,pesoB;
      pesoA = 3.5;
      pesoB = 7.5;
      double MEDIA;
      MEDIA = ((A *pesoA) + (pesoB * B))/11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
      
  }
}
