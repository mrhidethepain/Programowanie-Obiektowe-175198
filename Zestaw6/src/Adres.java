import java.util.Objects;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;
    public Adres() {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, String numerDomu, String miasto,String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = null;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public String toString() {
        return kodPocztowy+" "+miasto+" "+ulica+" "+numerDomu+" "+numerMieszkania;

    }
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Adres adres = (Adres) o;
        return kodPocztowy==adres.kodPocztowy&& Objects.equals(ulica,adres.ulica)&&Objects.equals(numerDomu,adres.numerDomu)&&Objects.equals(numerMieszkania,adres.numerMieszkania);
    }
    public int hashCode() {
        return Objects.hash(ulica,numerDomu,numerMieszkania,miasto,kodPocztowy);
    }
}

