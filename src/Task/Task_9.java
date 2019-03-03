package Task;

import java.util.Formatter;

public class Task_9 {
    int Num;

    public Task_9(int num) {
        this.Num = num;
        Solve();
    }

    void Solve(){
        int i = 0;
        int Temp = 0;

        Formatter f = new Formatter(System.out);

        for(int Num_1 = 1; Num_1 < (int) Math.sqrt(Num); Num_1++){


            for (int Num_2 = 1; Num_2 < (int) Math.sqrt(Num); Num_2++) {

                Temp = Num_1 * Num_1 + Num_2 * Num_2;

                if(Temp == Num){
                    f.format("%-5s = %5s    + %5s\n", Num, Num_1, Num_2);
                    i++;
                }

                if (Temp > Num) {
                 break;
                }
            }

        }

        if(i != 0){
            System.out.println("Можно представить");
        }else {
            System.out.println("Нельзя представить");
        }

    }
}
