import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //zadanie1
        String imie = "Szymon";
        String nazwisko = "Surdyk";
        System.out.println(imie + " " + nazwisko);
        //zadanie2
        String imienazwisko="SzymonSurdyk";
        System.out.println("Długość imienia: " + imie.length());
        System.out.println("Długość nazwiska: " + nazwisko.length());
        System.out.println("Długość imienia i nazwiska: " + imienazwisko.length());
        //zadanie3
        String word1 = "Ala";
        String word2 = "ma";
        String word3 = "kota";
        System.out.println(word1 + " " + word2 + " " + word3);
        //zadanie4
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");
        System.out.println("      *");
        System.out.println("     * *");
        System.out.println("   * * * *");
        System.out.println("  * * * * * ");
        System.out.println("* * * * * * *");
        System.out.println("  * * * * * ");
        System.out.println("   * * * *");
        System.out.println("    * * * ");
        System.out.println("     * *");
        System.out.println("      *");
        //zadanie5
        String zdanie = "Ala ma kota";
        String zamienione = zdanie.replace('a', 'e');
        System.out.println(zamienione);
        //zadanie6
        for (char word : zdanie.toCharArray()) {
            if (Character.isUpperCase(word)) {
                System.out.print(Character.toLowerCase(word));
            } else {
                System.out.print(Character.toUpperCase(word));
            }
        }
        //zadanie7
        char[] znaki = {'A', '!', '@', '>', '~', '\n', '\b'};
        for (char ascii : znaki) {
            System.out.println("Kod ASCII " + ascii + " to " + (int) ascii);
        }
        //zadanie8
        char mmin='a';
        char mmax='z';
        char dużemin='A';
        char dużemax='Z';
        char cmin='0';
        char cmax='9';
        System.out.println("Małe litery znajdują się w przedziale " + (int) mmin + " do "+(int) mmax);
        System.out.println("Duże litery znajdują się w przedziale " + (int) dużemin + " do "+(int) dużemax);
        System.out.println("Cyfry znajdują się w przedziale " + (int) cmin + " do "+(int) cmax);
        //zadanie9
        String slowo1="Kot";
        String slowo2="zwierzakiem";
        String slowo3="wielkosc";
        System.out.printf("Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje\n",slowo1,slowo2,slowo3);
        //zadanie10
        String author="Brandona Sandersona";
        String book="Słowa Światłości";
        System.out.printf("%s to najlepsza książka napisana przez %s\n",book,author);
        //zadanie11
        String slowo="wodrze";
        for (int i=0; i<5; i++) {
            System.out.printf(slowo);
        }
        //zadanie12
        LocalDate dzis=LocalDate.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalTime godzina= LocalTime.now();
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.printf("Dziasiaj jest %s, godzina %s",dzis.format(format), godzina.format(format2));
        //zadanie13
        int[] tablica={54,103,241,67,9999,"SzymonSurdyk".length(),175198};
        for (int i : tablica) {
            System.out.println(i + " : " + (char) i);


        }
    }
}
