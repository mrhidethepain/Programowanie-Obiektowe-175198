import java.util.Scanner;

import static java.lang.Math.pow;
public class Main {
//    public static int[] ciagArytmetycznyRodzajuM(int n,int m,int a1,int r){
//        int[] ciag = new int[n];
//        for(int i=0;i<m;i++){
//
//        }
//        return ciag;
//    }
    public static boolean czyCiagArytmetyczny(int[] tab){
        if(tab.length<2) return true;
        int r=tab[1]-tab[0];
        for(int i=2;i<tab.length-1;i++){
            {
                if(tab[i+1]-tab[i]!=r) return false;
            }
        }
        return true;
    }
    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab,int m) {
        int[] newtab = new int[tab.length - m];
        int[] temptab = tab;
        for(int i=0;i<m-1;i++){
            newtab[i] = temptab[i+1]-temptab[i];
            temptab=newtab;
        }
        if(newtab.length<2) return true;
        int r=newtab[1]-newtab[0];
        for(int i=2;i<newtab.length-1;i++){
            {
                if(newtab[i+1]-newtab[i]!=r) return false;
            }
        }
        return true;
    }




    public static int podciag(int[]tab){
        int maxLen=1;
        int currentLen=1;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i+1]>tab[i]){
                currentLen++;
                maxLen=Math.max(maxLen,currentLen);
            }
            else{
                currentLen=1;
            }
        }
        return maxLen;
    }
    public static int podciag(int[]tab,int r){
        int maxLen=1;
        int currentLen=1;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i+1]>tab[i] && tab[i+1]-tab[i]-r==0){
                currentLen++;
                maxLen=Math.max(maxLen,currentLen);
            }
            else{
                currentLen=1;
            }
        }
        return maxLen;
    }
    public static int[]sekwencjaCollatza(int n,int c){
        int[] sekwencja = new int[n];
        sekwencja[0]=c;
        for(int i=1;i<n;i++){
            if (sekwencja[i-1]%2==0){
                sekwencja[i]=sekwencja[i-1]/2;
            }
            else{
                sekwencja[i]=sekwencja[i-1]*3+1;
            }
        }
        return sekwencja;
    }
    public static void minMaxSekwencjaCollatza(int n,int c){
        int[] sekwencja = new int[n];
        sekwencja[0]=c;
        for(int i=1;i<n;i++){
            if (sekwencja[i-1]%2==0){
                sekwencja[i]=sekwencja[i-1]/2;
            }
            else{
                sekwencja[i]=sekwencja[i-1]*3+1;
            }
        }
        int najwieksza = sekwencja[0];
        int najmniejsza=sekwencja[0];
        for (int i = 1; i < sekwencja.length; i++) {
            if (sekwencja[i] > najwieksza) {
                najwieksza = sekwencja[i];
            }
            if (sekwencja[i] < najmniejsza) {
                najmniejsza = sekwencja[i];
            }
        }
        System.out.println("min="+najmniejsza);
        System.out.println("max="+najwieksza);
    }
    public static void main(String[] args) {
//        int[] ciag = ciagArytmetycznyRodzajuM(4, 2, 1, 2);
//        for (int i = 0; i < ciag.length; i++) {
//            System.out.println(ciag[i]);
//        }
        int[] ciag={1,8,27,64,125};
        boolean odp=czyCiagArytmetyczny(ciag);
        System.out.println(odp);
//        boolean odp2=czyCiagArytmetycznyRodzajuM(ciag,3);
//        System.out.println(odp2);
        int[] tablica = {1, 2, 0, 3, 5, 1, 4};
        System.out.println("Najdluzszy ciag rosnących: ");
        int x = podciag(tablica);
        System.out.println(x);
        System.out.println("Podaj stałą wartość r: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int y = podciag(tablica, r);
        System.out.println(y);
        System.out.println("Ile liczb sekwencji?:");
        int n = sc.nextInt();
        System.out.println("Jaka liczba startowa?:");
        int c = sc.nextInt();
        int[] sekwencja = sekwencjaCollatza(n, c);
        for (int i = 0; i < sekwencja.length; i++) {
            System.out.print(sekwencja[i] + " ");
        }
        System.out.println();
        minMaxSekwencjaCollatza(n, c);


    }
    }



