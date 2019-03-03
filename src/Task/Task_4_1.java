package Task;

public class Task_4_1 {

    public Task_4_1(){
       Solve();

    }

    void Solve(){
        int[] posl = {1, 2, 32, 165, 186, 210};
        int i = 0;
        int temp = 0;
        while(i < posl.length - 1){

            if(posl[i] < posl[i+1]){
                temp++;
            }
i++;
        }
        if(temp == posl.length - 1){
            System.out.print("Возврастает");
        }

    }


}
