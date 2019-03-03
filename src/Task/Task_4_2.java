package Task;

public class Task_4_2 {

    public Task_4_2(){
        Solve_Gnom();
    }

    void Solve_Gnom(){
        double[] Array = {1, 2, 15, 50, -90, -100, -15.2, 340};
       Show_Array(GnomeSort(Array));
        Show_Array(BubleSort(Array));
    }

    double[] GnomeSort(double[] Array){

            double Temp;
            int i = 1;
            while(i < Array.length ){

                if(i==0 || Array[i-1] <= Array[i]){
                    i++;
                }
                else{
                    Temp = Array[i];
                    Array[i] = Array[i-1];
                    Array[i-1] = Temp;
                    i--;
                }
            }

        return Array;
    }

    double[] BubleSort(double[] Array){
/**
 * В сортировке пузырьком происходит сравнение пар чисел друг с
 * другом с последующим их обменом
 *
 * */
    int i = 1;
    while(i < Array.length){

        if(Array[i-1] <= Array[i]){
           i++;
        }else{
            double Temp = Array[i];
            Array[i-1]=Array[i];
            Array[i] = Temp;
            i=0;
        }

    }


        return Array;
    }

    double[] MergeSort(){
        double[] Array_1 = {1, 5, 10 , 15, 18};
        double[] Array_2 = {6, 8, 9, 10, 15, 99};
        double[] Array = new double[Array_1.length + Array_2.length];


        return Array;

    }

    void Show_Array(double[] Array){
        for (int i = 0; i < Array.length-1; i++){
            System.out.print(Array[i]+ " ");
        }
        System.out.println();
    }

}
