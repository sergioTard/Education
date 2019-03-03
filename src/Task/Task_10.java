package Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_10 {
     int Num;

    public Task_10(int num) {
        this.Num = num;
        Solve();
    }

    private void Solve(){

        List<Integer> Numer_Num = new ArrayList<>();
        while(Num > 0){
            Numer_Num.add(Num % 10);
            Num = Num/10;
        }
        Set<Integer> Num = new HashSet<>(Numer_Num);
        if(Num.size() == Numer_Num.size()){
            System.out.println("Число состоит из не повторяющихся цыфр");
        }else {

            System.out.println("цыфры повторяются");
        }

    }
}
