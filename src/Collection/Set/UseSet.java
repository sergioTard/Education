package Collection.Set;

import java.util.*;

public class UseSet {


 void SimpleUseSet(){

     Integer[] Array_1 = {15, 10, 152, 15, 20 , 40};

     HashSet<Integer> HS = new HashSet<>();

     for(Integer e : Array_1) {
         System.out.println(HS.add(e));
     }
     System.out.println("Размер массива: " +Array_1.length +"\n"+"Размер Множества: "+ HS.size()+ "  ");
     System.out.println(HS.contains(new Integer(10)));
     ShowSet(HS);
 }

    public static void main(String[] arg){
/*
        MyClassConteiner<Integer, Integer> a1 = new MyClassConteiner<> (10,12);
        MyClassConteiner<Integer, Integer> a2 = new MyClassConteiner<> (10,12);

        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());

        HashSet<MyClassConteiner> HS = new HashSet<>();

       HS.add(new MyClassConteiner<> (10,15.546));
       HS.add(new MyClassConteiner<> (10,15.546));
       HS.add(new MyClassConteiner<> (10,5));
       HS.add(new MyClassConteiner<> (10,12));
       HS.add(new MyClassConteiner<> (10,12));

        HashSet<Integer> Hkl = new HashSet<>();
        Hkl.add(1);
        Hkl.add(3+16*1);
        Hkl.add(3+16*2);
        Hkl.add(3+16*3);
        Hkl.add(3+16*4);
        Hkl.add(3+16*5);

for(Integer e : Hkl){

    System.out.println(e);

}*/


      //  ShowSet(HS);
/*
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
        LHS.add(1);
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);
        LHS.add(5);
        LHS.add(45);
        LHS.add(456);
        LHS.add(3);

        LinkedHashSet<MyClassConteiner> LHS_2 = new LinkedHashSet<>();
        LHS_2.add(new MyClassConteiner<> (15,7));
        LHS_2.add(new MyClassConteiner<> (10,1));
        LHS_2.add(new MyClassConteiner<> (11,2));
        LHS_2.add(new MyClassConteiner<> (11,3));
        LHS_2.add(new MyClassConteiner<> (12,4));
        LHS_2.add(new MyClassConteiner<> (13,5));
        LHS_2.add(new MyClassConteiner<> (14,6));


        for(MyClassConteiner e : LHS_2){

            System.out.println(e.toString() + " ");

        }
*/

      /*  SortedSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 ==o2) return 0;
                return o1>o2 ? 1 : -1;
            }
        });*/

    /*    for (int i = 0; i <= 10; i++){

       //     set.add(i);
//System.out.println(i);
        }*/

    }

    public static <T> void ShowSet(Set<T> a){
        Iterator<T> It = a.iterator();
        System.out.println(a.size());
        while(It.hasNext()){
            System.out.print(It.next().toString()+"   ");
        }

    }




}
