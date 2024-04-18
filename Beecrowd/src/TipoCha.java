import java.util.Scanner;

public class TipoCha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T;
        int A,B,C,D,E;
        T = scan.nextInt();
        if(0>=T && T>5){
        T = scan.nextInt();
        }
        A=scan.nextInt();
        B=scan.nextInt();
        C=scan.nextInt();
        D=scan.nextInt();
        E=scan.nextInt();
        int cont=0;
        if(T==A){
            cont++;
        }
        if(T==B){
            cont++;
        }
        if(T==C){
            cont++;
        }
        if(T==D){
            cont++;
        }
        if(T==E){
            cont++;
        }  
        System.out.println(""+cont);
   }
}
