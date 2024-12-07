import java.util.Objects;
class Osoba {
    private String imie;
    private String nazwisko;
    private String PESEL;
    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.PESEL=PESEL;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setPESEL(String PESEL) {
        if(PESEL==null || PESEL.isEmpty() || PESEL.length()!=11){
            throw new IllegalArgumentException("PESEL is null or empty");
        }
        this.PESEL = PESEL;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getPESEL() {
        return PESEL;
    }
    @Override
    public String toString() {
        return "imie: "+imie+"nazwikso: "+nazwisko+"PESEL: "+PESEL;
    }
    public char znakPESEL(int index){
        return PESEL.charAt(index);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie,nazwisko,PESEL);
    }
    public class TestOsoba{
        public static void main(String[] args) {

        }
    }
}
