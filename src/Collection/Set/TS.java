package Collection.Set;

import java.util.*;

public class TS {
    public static void main(String[] arg){

        Integer[] Array = {1,2,3,4,5,7};

        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(Array));

      /*  for(Integer e : set){
            System.out.println(e);
        }*/
      //  System.out.println(getNextElem(set, 5));

    }

    static Integer getNextElem(SortedSet<Integer> set, Integer e){
        Iterator<Integer> iter = set.iterator();

        while(iter.hasNext()){
            if(iter.next() == e){
                return iter.next();
            }
        }
      return  0;
    }

    static SortedSet<Integer> getPrevElem(SortedSet e, Integer E_start, Integer E_end ){
        e.subSet(E_start, E_end);
        return e;
    }
}
