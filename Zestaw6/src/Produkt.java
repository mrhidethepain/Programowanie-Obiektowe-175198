import java.util.Objects;

class Produkt{
    private String nazwa;
    private int cena;
    private int iloscNaMagazynie;
    public Produkt(String nazwa, int cena, int iloscNaMagazyne) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaMagazynie=iloscNaMagazyne;
    }
    public String wyswietlInformacje() {
       return "nazwa: "+nazwa+" cena: "+cena+" ilość na magazynie: "+iloscNaMagazynie;
    }
    public void dodajDoMagazynu(int liczba){
        this.iloscNaMagazynie+=liczba;
    }
    public void usunZMagazynu(int liczba){
        if(iloscNaMagazynie>=liczba){
            this.iloscNaMagazynie-=liczba;}
    }
    public String getNazwa() {
        return nazwa;
    }
    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }
    @Override
    public String toString() {
        return "Produkt="+nazwa+"iloscNaMagazynie="+iloscNaMagazynie;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null||(getClass()!=obj.getClass())) return false;
        Produkt produkt = (Produkt) obj;
        return iloscNaMagazynie==produkt.iloscNaMagazynie&& Objects.equals(nazwa, produkt.nazwa);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nazwa, iloscNaMagazynie);
    }

}