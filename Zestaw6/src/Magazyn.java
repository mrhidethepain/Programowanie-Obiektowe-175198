import java.util.HashMap;
import java.util.Map;

class Magazyn {

    private Map<String,Produkt> produkty;
    public Magazyn() {
        this.produkty = new HashMap<>();
    }
    public void dodaj(Produkt produkt) {
        if(produkt==null) {
            throw new NullPointerException("Produkt ne smije biti null");
        }
        produkty.put(produkt.getNazwa(), produkt);
    }
    public String wyswietl() {
        String temp="";
        System.out.println("Asortyment magazynu:");
        for(Produkt produkt : produkty.values()) {
            temp+=produkt;
        }
        return temp;
    }



}
