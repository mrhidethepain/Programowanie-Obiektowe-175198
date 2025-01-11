public class Dog extends Animal{
    public String rasa;
    public Dog(String name, int weight, String rasa) {
        super(name, weight);
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }
}
