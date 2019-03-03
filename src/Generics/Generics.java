package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Generics<T> {

    public T a;

    public Generics(T a){
        this.a = a;
    }

    public void dou(){
        System.out.println(a.toString());
    }

    public static void main(String[] arg){
        Generics<?> Sample;

        Sample = new Generics<>("dfl");
        Sample.dou();
       System.out.print(Sample.a.getClass().getConstructors());


    }

}
