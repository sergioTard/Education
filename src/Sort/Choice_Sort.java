package Sort;

public class Choice_Sort implements Sort{

    public Choice_Sort(int[] Array){
  Sort(Array);
    }


    @Override
    public void Sort(int[] Array) {
        int temp, j ;
        for(int i = 0; i < Array.length-1; i++){
            if(Array[i] >= Array[i+1]){
                temp = Array[i+1];
                Array[i+1]=Array[i];
                Array[i]= temp;
            }
        }
    }
}
