package Task;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {

    int Number;

    public Task_3(int Number) {
    this.Number =Number;
    Solve();
    }

    void Solve(){

        double Temp = Number;
        int del = 10;
        int i = 0;
        List<Integer> Numeritical = new ArrayList<>();
        while(Temp!=0){
            Numeritical.add((int)(Temp % 10));
            Temp = (int)(Temp / del);
           // System.out.println(i+"  "+ Numeritical.get(i)+"  "+Temp);
            i++;
        }
        System.out.println(i);
        int Sum=0;

for(int j =0;j<i;j++){

    Sum+= Math.pow(Numeritical.get(j), i);

}
System.out.println(Sum);

if (Sum==Number){

    System.out.println("Это число Армстронга");
}else {
    System.out.println("Не число Армстронга");
}



    }
}
