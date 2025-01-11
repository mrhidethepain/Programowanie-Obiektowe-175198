public class Animal{
    public String name;
    public int weight;
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setName(String name){
        this.name = name;
    }
}
