import java.util.Scanner;
public class Main {
    public static void trojkiPitagorejskie(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && c * c == a * a + b * b) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
    }
    public static void funKwaRozwiazania(int n) {
        for (int a = 1; a <= n; a++) {  // 'a' nie może być 0, bo wtedy równanie nie jest kwadratowe
            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
                    }
                }
            }
        }
    }
    public static void funKwaDelta(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    int sqrtDelta = (int) Math.sqrt(delta);
                    if (delta >= 0 && sqrtDelta * sqrtDelta == delta) {
                        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            if (czyPierwsza(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean czyPierwsza(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void liczbyPodzielne(int m, int n) {
        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void piramida(int n, int wariant) {
        char c;
        if (wariant == 1) {
            c = '*';
        } else if (wariant == 2) {
            c = '#';
        } else {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static long silnia(int n) {
        if (n <= 1) return 1;
        return n * silnia(n - 1);
    }
    public static long silniaPodwojna(int n) {
        long wynik = 1;
        for (int i = n; i > 0; i -= 2) {
            wynik *= i;
        }
        return wynik;}

    public static long silnia(int m, int n) {
        long wynik = 1;
        for (int i = n; i > 0; i -= m) {
                wynik *= i;
        }
        return wynik;
        }
    public static long dwumianNewtona(int n, int k) {
        return silnia(n) / (silnia(k) * silnia(n - k));
    }
    public static void ciagFibonacciego(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    public static int sumaNaturalnych(int n) {
        return n * (n + 1) / 2;
    }
    public static int sumaParzystych(int n) {
        return n * (n + 1);
    }

    public static int sumaNieparzystych(int n) {
        return n * n;
    }
    public static int sumaKwaNaturalnych(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static int sumaSzeNaturalnych(int n) {
        return (int) Math.pow(n * (n + 1) / 2, 2);
    }
    public static double sumaOdwNaturalnych(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        return suma;
    }
    public static void czyPalindrom(int num) {
        String string = Integer.toString(num);
        int strLen = string.length() - 1;
        for (int i = 0; i <= strLen; i++) {
            if (string.charAt(i) != string.charAt(strLen - i)) {
                System.out.println("Numer nie jest palindromem");
                return;
            }
        }

        System.out.println("Numer jest palindromem");
    }
    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] wczytajTablice(int n) {
        int[] res = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: ", i + 1);
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void podzbiory(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d],", arr[i]);
        }
    }








    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n:");
        int n=scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj m:");
        int m=scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        char wyraz=scanner3.next().charAt(0);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a=scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Podaj b:");
        int b=scanner5.nextInt();
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Podaj k:");
        int k=scanner6.nextInt();
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Podaj tablice:");
        int[] tab=wczytajTablice(n);
        //trojkiPitagorejskie(n);
        //funKwaRozwiazania(n);
        //funKwaDelta(n);
        //liczbyPierwsze(n);
        //liczbyPodzielne(n,m);
//        piramida(n,2);
//        silnia(m, n);
//        dwumianNewtona(n, k);
//        ciagFibonacciego(n);
//        sumaNaturalnych(n);
//        sumaParzystych(n);
//        sumaNieparzystych(n);
//        sumaKwaNaturalnych(n);
//        sumaSzeNaturalnych(n);
//        sumaOdwNaturalnych(n);
//        czyPalindrom(wyraz);
//        trojkatPascala(n);
//        czyPalindrom(n);
//        czyDoskonala(n);
//        czyPierwsza(n);
//        NWD(a, b);
//        wczytajTablice();
//        podzbiory(tab);
        }

    }
