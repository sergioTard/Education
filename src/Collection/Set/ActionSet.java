package Collection.Set;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ActionSet  {

    static  public Set intersect(Set a , Set b){
        a.retainAll(b);
        return a;
    }
    static  public Set union(Set a , Set b){
        a.addAll(b);
        return a;
    }

    static public void main(String[] arg){

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        union(a,b);

        for(Integer e : a){
            System.out.println(e);
        }

    }
}
