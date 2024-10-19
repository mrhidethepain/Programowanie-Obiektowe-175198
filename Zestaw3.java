import java.util.Scanner;

public class Main {
    public static int trojkipitagoresjkie(int n){
        System.out.println("ZADANIE 1");
        for(int i =1;i<=n;i++){
            for(int j=i;j<=n;j++){
                int k= (int) Math.sqrt(i*i+j*j);
                if(k*k==i*i+j*j &&k<=n){
                    System.out.println(i+", "+j+", "+k);
                }
            }
        }


        return 0;
    }
    public static int funKwaRozwiazania(int n){
        System.out.println("ZADANIE 2");
        for(int a=-n;a<=n;a++){
            for(int b=-n;b<=n;b++){
                for(int c=-n;c<=n;c++){
                    if(a!=0){
                        int x=b*b-4*a*c;
                        if(x>=0){
                           System.out.println(a+", "+b+", "+c);

                        }
                    }
                }
            }
        }
        return 0;
    }
    public static int funKwaDelta(int n){
        System.out.println("ZADANIE 3");
        for(int a=-n;a<=n;a++){
            for(int b=-n;b<=n;b++){
                for(int c=-n;c<=n;c++){
                    if(a!=0){
                        int x=b*b-4*a*c;
                        if(x>0){
                            if(Math.sqrt(Math.sqrt(x))%1==0){
                                System.out.println(a+", "+b+", "+c+", "+Math.sqrt(x));
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public static boolean czyPierwsza(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static int liczbyPierwsze(int n){
        System.out.println("ZADANIE 4");
        for(int i=2;i<=n;i++){
            if(czyPierwsza(i)){
                System.out.print(i+", ");
            }
        }
        return 0;
    }
    public static int liczbyPodzielne(int n, int m){
        System.out.println("ZADANIE 5");
        int x=1;
        int y=10;
        for(int i=0;i<m;i++){
            x*=10;
            y*=10;
        }
        for(int i=x;i<y;i++){
            if(i%n==0){
                System.out.println(i+", ");
            }
        }
        return 0;
    }
    public static int trojkatPascala(int n){
        int x=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                if(l==0){
                    System.out.print(1+ " ");
                }
                else{
                    x=silnia(i)/silnia(l)*silnia(i-l);
                }
                System.out.print(x+" ");
            }
        }
        return n;
    }
    public static int silnia(int n){
        System.out.println("ZADANIE 7");
        int x=1;
        for(int i=1; i<=n;i++){
            x*=i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n=scanner.nextInt();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj m");
        int m=scaner.nextInt();
//        System.out.println(silnia(n));
//        trojkatPascala(n);
//        trojkipitagoresjkie(n);
//        funKwaRozwiazania(n);
//        funKwaDelta(n);
        liczbyPierwsze(n);
        liczbyPodzielne(n, m);
    }

}
