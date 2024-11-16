import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int najwieksza(int[] tab) {
        int najwieksza = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > najwieksza) {
                najwieksza = tab[i];
            }
        }
        return najwieksza;
    }
    public static int najmniejsza(int[] tab) {
        int najmniejsza = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < najmniejsza) {
                najmniejsza = tab[i];
            }
        }
        return najmniejsza;
    }
    public static void ileNieparzystych(int[] tab) {
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]%2!=0) {
                licznik++;
            }

            }
        System.out.println(licznik);
        }
    public static void ileParzystych(int[] tab) {
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]%2==0) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }
    public static void ileDodatnich(int[] tab) {
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]>0) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }
    public static void ileUjemnych(int[] tab) {
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]<0) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }
    public static int ileZerowych(int[] tab) {
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]==0) {
                licznik++;
            }
        }
        System.out.println(licznik);
        return licznik;
    }
    public static void ileMaksymalnych(int[] tab){
        int licznik=0;
        int najwieksza=najwieksza(tab);
        for (int i=0;i<tab.length;i++) {
            if (tab[i]==najwieksza) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }
    public static void ileMinimalnych(int[] tab){
        int licznik=0;
        int najmniejsza=najmniejsza(tab);
        for (int i=0;i<tab.length;i++) {
            if (tab[i]==najmniejsza) {
                licznik++;
            }
        }
    }
    public static void ileUnikalnych(int[] tab){
        int licznik=0;
        for (int i=0;i<tab.length;i++) {
            for (int j=i+1;j<tab.length;j++) {
                if (tab[i]!=tab[j]) {
                    licznik++;
                }
            }
        }
        System.out.println(licznik);
    }
    public static void sumaDodatnich(int[] tab) {
        int suma=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]>0) {
                suma+=tab[i];
            }
        }
        System.out.println(suma);
    }
    public static void sumaUjemnych(int[] tab) {
        int suma=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i]<0) {
                suma+=tab[i];
            }
        }
        System.out.println(suma);
    }
    public static void sumaOdwrotnosci(int[]tab){
        float suma=0;
        for (int i=0;i<tab.length;i++) {
            suma+=1/tab[i];
        }
        System.out.println(suma);
    }
    public static void sredniaArytmetyczna(int[] tab) {
        int suma=0;
        for (int i=0;i<tab.length;i++) {
            suma+=tab[i];
        }
        System.out.println(suma/tab.length);
    }
    public static void sredniaGeometryczna(int tab[]){
        int geo=0;
        for (int i=0;i<tab.length;i++) {
            geo*=tab[i];
        }
        double sg=pow(geo,1/tab.length);
        System.out.println(sg);

    }
    public static void sredniaHarmoniczna(int[] tab) {
        int suma=0;
        for (int i=0;i<tab.length;i++) {
            suma+=1/tab[i];
        }
        double srednia=tab.length/suma;
        System.out.println(srednia);
    }


    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            tablica[i] = (int) (Math.random() * (maxWartosc - minWartosc + 1) + minWartosc);
        }
        return tablica;
    }
    public static void wypiszTablice(int[] tab, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index = i * m + j;
                if (index < tab.length) {
                    System.out.printf("%4d ", tab[index]);
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = a * tab[i] + b;
        }
        return tab;
    }
    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        for(int i=0;i<tab.length;i++){
            tab[i]= (int) (a*pow(tab[1],2)+b*tab[i]+c);
        }
        return tab;
    }
    public static int[] funkcjaWykladnicza(int[] tab, int a) {
        for(int i=0;i<tab.length;i++){
            tab[i]= (int) pow(a,tab[i]);
        }
        return tab;
    }
    public static int[] funkcjaSignum(int[] tab) {
        for(int i=0;i<tab.length;i++){
            tab[i]= (int) Math.signum(tab[i]);
        }
        return tab;
    }
    public static int najdluzszyCiagDodatnich(int[] tab) {
        int maxLen = 0, currentLen = 0;
        for (int num : tab) {
            if (num > 0) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }
        return maxLen;
    }

    public static int najdluzszyCiagUjemnych(int[] tab) {
        int maxLen = 0, currentLen = 0;
        for (int num : tab) {
            if (num < 0) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }
        return maxLen;
    }
    public static int[] odwrocTablice(int[] tab) {
        int[] tab2 = new int[tab.length];

        for (int i = 0, j = tab.length - 1; i < tab.length; i++, j--) {
            tab2[i] = tab[j];
        }

        return tab2;
    }

    public static int[] odwrocTablice(int[] tab, int indexStart, int indexStop) {
        int[] tab2 = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
        }

        for (int i = indexStart, j = indexStop; i <= indexStop; i++, j--) {
            tab2[i] = tab[j];
        }

        return tab2;
    }
    public static int[] generujZakres(int n, int minWartosc, int maxWartosc) {
        int[] tablica = new int[n];
        double step = (double) (maxWartosc - minWartosc) / (n - 1);
        for (int i = 0; i < n; i++) {
            tablica[i] = (int) (minWartosc + i * step);
        }
        return tablica;
    }



    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj n");
    int n = scanner.nextInt();
    System.out.println("Podaj wartosc minimalna");
    int minWartosc = scanner.nextInt();
    System.out.println("Podaj wartosc maksymalna");
    int maxWartosc = scanner.nextInt();
    int[] tablica = generujTablice(n, minWartosc, maxWartosc);
    System.out.println("Tablica: ");
    for (int i = 0; i < tablica.length; i++) {
        System.out.print(tablica[i]+" ");
    }
    System.out.println();
        System.out.println("Ile nieparzystych elementow w tablicy?");
        ileNieparzystych(tablica);
        System.out.println("Ile parzystych elementow w tablicy?");
        ileParzystych(tablica);
        System.out.println("Ile dodatnych elementow w tablicy?");
        ileDodatnich(tablica);
        System.out.println("Ile ujemnych elementow w tablicy?");
        ileUjemnych(tablica);
        System.out.println("Ile zerowych elementow w tablicy?");
        ileZerowych(tablica);
        System.out.println("Ile maksymalnych elementow w tablicy?");
        ileMaksymalnych(tablica);
        System.out.println("Ile minimalnych elementow w tablicy?");
        ileMinimalnych(tablica);
        System.out.println("Ile unikalnych elementow w tablicy?");
        ileUnikalnych(tablica);
        System.out.println("Suma dodatnich elementow w tablicy:");
        sumaDodatnich(tablica);
        System.out.println("Suma ujemnych elementow w tablicy:");
        sumaUjemnych(tablica);
//        System.out.println("Suma odwrotnosci elementow w tablicy:");
//        sumaOdwrotnosci(tablica);
        System.out.println("Srednia Arytmetyczna elementow w tablicy:");
        sredniaArytmetyczna(tablica);
        System.out.println("Srednia Geometryczna elementow w tablicy:");
        sredniaGeometryczna(tablica);
//        System.out.println("Srednia Harmoniczna elementow w tablicy:");
//        sredniaHarmoniczna(tablica);


    System.out.println("Podaj pierwszy wymiar");
    int n2=scanner.nextInt();
    System.out.println("Podaj drugi wymiar");
    int m=scanner.nextInt();
    wypiszTablice(tablica,n2,m);

    System.out.println();
    System.out.println("Podaj wartosc a");
    int a=scanner.nextInt();
    System.out.println("Podaj wartosc b");
    int b=scanner.nextInt();
    System.out.println("Podaj wartosc c");
    int c=scanner.nextInt();
    System.out.println("Funkcja Liniowa: ");
    int[] tablica2 = funkcjaLiniowa(tablica, a, b);
    for (int i = 0; i < tablica2.length; i++) {
        System.out.print(tablica2[i]+" ");
    }
    System.out.println();
    System.out.println("Funkcja kwadratowa: ");
    int[] tablica3 = funkcjaKwadratowa(tablica, a, b, c);
    for (int i = 0; i < tablica3.length; i++) {
        System.out.print(tablica3[i]+" ");
    }
    System.out.println();
    System.out.println("Funkcja wykladnicza: ");
    int[] tablica4 = funkcjaWykladnicza(tablica, a);
    for (int i = 0; i < tablica4.length; i++) {
        System.out.print(tablica4[i]+" ");
    }
    System.out.println();
    System.out.println("Funkcja signum: ");
    int[] tablica5 = funkcjaSignum(tablica);
    for (int i = 0; i < tablica5.length; i++) {
        System.out.print(tablica5[i]+" ");
    }
    System.out.println();
    System.out.println("Najdluzszy ciag dodatnich: ");
    int n3=najdluzszyCiagDodatnich(tablica);
    System.out.println(n3);
    System.out.println("Najdluzszy ciag ujemnych: ");
    int n4=najdluzszyCiagUjemnych(tablica);
    System.out.println(n4);
    System.out.println("Odwrotna tablica: ");
    int[] tablica6 = odwrocTablice(tablica);
    for (int i = 0; i < tablica6.length; i++) {
        System.out.print(tablica6[i]+" ");
    }
    System.out.println();
    System.out.println("Podaj indeks poczatkowy");
    int indeksStart=scanner.nextInt();
    System.out.println("Podaj indeks koncowy");
    int indeksStop=scanner.nextInt();
    System.out.println("Odwrotna tablica punktu: ");
    int[] tablica7 = odwrocTablice(tablica,indeksStart,indeksStop);
    for (int i = 0; i < tablica7.length; i++) {
        System.out.print(tablica7[i]+" ");
    }
    System.out.println();
    System.out.println("Podaj wartosc minimalna");
    int minWartosc2=scanner.nextInt();
    System.out.println("Podaj wartosc maksymalna");
    int maxWartosc2=scanner.nextInt();
    int[] tablica8 = generujZakres(n, minWartosc2, maxWartosc2);
    System.out.println("Tablica: ");
    for (int i = 0; i < tablica8.length; i++) {
        System.out.print(tablica8[i]+" ");
    }





    }

}