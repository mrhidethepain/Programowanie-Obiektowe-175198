import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

class Box<T>{
    T objekt;

    public void setObjekt(T objekt){
        this.objekt = objekt;
    }

    public T getObjekt(){
        return objekt;
    }
}


class Counter<T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }
    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}

public class TestGeneryczne {

    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }
    public static <T> void swap(T[] myArray,int a,int b){
        if(a<myArray.length && b<myArray.length){
        T tmp = myArray[a];
        myArray[a] = myArray[b];
        myArray[b] = tmp;}}
    public static <T extends Comparable<T>> void minValue(T[]myArray){
            if(myArray.length>0){
            T min = myArray[0];
            for(int i=1;i<myArray.length;i++){
                if(myArray[i].compareTo(min)<0){
                    min = myArray[i];
                }
            }
            System.out.println(min);
            }
            else {
                System.out.println("null");
            }
        }
        public static <T extends Comparable<T>> void findMax(Animal element1, Animal element2){
        if(element1.weight > element2.weight){
            System.out.println(element1.name);
        }
        else{
            System.out.println(element2.name);
        }
        }
        class




    public static void main(String[] args) {
        Animal lew=new Animal("Lew",150);
        Dog pimpek=new Dog("Pimpek",190,"Owczarek");
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Integer> box22 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setObjekt("slowo");
        System.out.println(box1.getObjekt());

        box2.setObjekt(3);
        System.out.println(box2.getObjekt());

        box22.setObjekt(3);
        System.out.println(box22.getObjekt());

        box3.setObjekt(3.);
        System.out.println(box3.getObjekt());

        System.out.println(isEqual(box1.getObjekt(),box2.getObjekt()));
        System.out.println(isEqual(box2.getObjekt(),box3.getObjekt()));
        System.out.println(isEqual(box2.getObjekt(),box22.getObjekt()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add(box1.getObjekt());
        stringCounter.add("slowo2");
        stringCounter.add("slowo3");
        System.out.println(stringCounter.getCount());
        String[] Myarray ={"aaaa","bbbbbb","cccccc"};
        swap(Myarray,1,2);
        System.out.println(Arrays.toString(Myarray));
        Integer[] Array={1,2,3,2,4,6,11,4,6,4,3,23,2,};
        swap(Array,4,5);
        Double[] Array1={0.1,0.76,0.5,10000.0};
        System.out.println(Arrays.toString(Array));
        minValue(Array);
        minValue(Myarray);
        minValue(Array1);
        findMax(lew,pimpek);


    }
}
