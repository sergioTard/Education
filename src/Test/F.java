package Test;


import java.util.Arrays;

public class F {

    public F(){
        Work[] works = new Work[10];
        for(int i = 0; i < works.length; i++){
            works[i] = new Work((int) (10*Math.random()));
            System.out.println(i+"   "+  works[i].prise);
        }
Arrays.sort(works);
for(Work e : works){

   System.out.println(e.prise);
}
    }


    void Read(){


    }
}
