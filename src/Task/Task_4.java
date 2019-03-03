package Task;

import java.util.ArrayList;
import java.util.List;

public class Task_4 implements Task {
    /**
     * Числа Фебоначи
    * */
    int Number;

    public Task_4(int number) {
        this.Number = number;
        Solve();
    }

   public void Solve(){
        int i = 2;
        List<Integer> Febonachi = new ArrayList<>();
        Febonachi.add(0);
        Febonachi.add(1);
        int Temp = 0;

        while(true){
            Temp = Febonachi.get(i-1)+Febonachi.get(i-2);
            Febonachi.add(Temp);
            System.out.println(Febonachi.get(i));
            if(Febonachi.get(i)> Number){
                break;
            }
           else if(Febonachi.get(i)== Number){
                System.out.println("Это число Фебоначи");
                break;
            }
           else if (Febonachi.get(i)< Number){
               i++;
            }


        }

    }

}
