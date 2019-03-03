package Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task_4_All {

    public Task_4_All(){

       // Decition_4_3 ();
       // Decition_4_4();
       // Decition_4_5();
       // Decition_4_6();

    }

    void Decition_4_3 (){

        double[] Array = Random_Array(10);

        Show_Matrix(Array);

        double Sum_2n = 0;
        double Sum_n  = 0;

        for(int i = 0; i < Array.length; i++){

            if(i % 2 == 0){
                Sum_2n += Array[i];
            }

            if(i % 2 == 1){
                Sum_n +=Array[i];
            }

        }
        System.out.println("\n Сумма чисел с четными индексами  , а с нечетными "+Sum_2n+"  "+ Sum_n);
    }

    void Decition_4_4(){

        int[] Array = Random_Array_int(10);

        Set <Integer> a = new HashSet<Integer>();

        for(int e : Array){

            a.add(e);

        }

        Iterator it = a.iterator();
int Sum = 0;

        while(it.hasNext()){
Object i = it.next();
Sum += (int) i;
            System.out.print(i+"   ");

        }
        if(a.size()== Array.length){
            System.out.print("Все элементы уникальны");
        }else{
            System.out.print("Есть элементы повторения");
        }
        System.out.println("\n"+Sum);
    }

    void Decition_4_5(){
        int[] Array = Random_Array_int(10);
        int[] Non_Sort = Array.clone();
      Gnome(Array);
        int Min = Array[0];
        int Max = Array[Array.length - 1];
System.out.print(Min + "  " + Max);
int t_1 = 0;
int t_2 = 0;

for(int i = 0; i< Non_Sort.length; i++){
      if(Non_Sort[i] == Max) {
          t_1 = i;
      }else if (Non_Sort[i] == Min){
          t_2 = i;
    }
}
       // Show_Matrix_int(Array);
        Show_Matrix_int(Non_Sort);
        System.out.println();
        System.out.println(t_1 +"  "+ t_2);
        System.out.println();
        for (int j = (t_1>t_2 ? t_2 : t_1); j < (t_1>t_2 ? t_1 : t_2); j++){
            System.out.print(Non_Sort[j]+"  ");
        }


    }

    void Decition_4_6(){
      int[] Seq_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] Seq_2 = {4, 5, 6, 7};
int Coincidence = 0;

      for(int i = 0; i < Seq_1.length - 3; i++){

            for(int j = 0; j < Seq_2.length; j++){

                if(Seq_1[i] == Seq_2[j]){
                   for(int u = 0; u < 4; u++){

                       if(Seq_1[i+u] == Seq_2[j+u]){
                           Coincidence++;
                       }
                       if(Coincidence==3){
                           break;
                       }
                   }
                }
                if(Coincidence==3){
                    break;
                }
            }
      }

        System.out.println(Coincidence);
    }

    void Decition_4_7(){


    }

    int[] Gnome(int[] A){

        int i = 1;
        while(i < A.length){
            if(i==0 || A[i-1] <=A[i]){
                i++;
            }else{
                int Temp = A[i-1];
                A[i-1]=A[i];
                A[i]=Temp;
                i--;
            }

        }

        return A;
    }

    double[] Random_Array(int length){

        double[] Array = new double[length];

        for(int i = 0; i < Array.length; i++){
            Array[i] = 15 - Math.random()*30;
        }

        return Array;
    }

    int[] Random_Array_int(int length){

        int[] Array = new int[length];

        for(int i = 0; i < Array.length; i++){
            Array[i] = (int) (15 - Math.random()*30);
        }

        return Array;
    }

    void Show_Matrix(double[] Array){

        for(int i = 0; i <Array.length; i++){

            System.out.print(Array[i]+"  ");

        }

    }

    void Show_Matrix_int(int[] Array){
System.out.println();
        for(int i = 0; i <Array.length; i++){

            System.out.print(Array[i]+"  ");

        }

    }




}
