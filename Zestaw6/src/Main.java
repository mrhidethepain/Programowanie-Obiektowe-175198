
class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("krzesło",70,45);
        Produkt p2 = new Produkt("stół",150,30);
        p1.wyswietlInformacje();
        p2.dodajDoMagazynu(6);
        p2.wyswietlInformacje();
        p1.usunZMagazynu(30);
        p1.wyswietlInformacje();
    }
}



