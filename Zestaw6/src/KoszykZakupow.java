import java.util.HashMap;
import java.util.Map;

class KoszykZakupowy {

    private Map<String, Integer> produkty;
    public KoszykZakupowy() {
        produkty = new HashMap<>();
    }
    public void dodajProdukty(String produkt, int ilosc) {
        produkty.put(produkt, ilosc);
    }
    public String pokazKoszyk(){
        String cos="";
        System.out.println("Koszyk");
        for(Map.Entry<String, Integer> entry : produkty.entrySet()){
            cos += entry.getKey() + " " + entry.getValue()+" ";
        }
        return cos;
    }
}
