package Matrix;

import java.util.ArrayList;
import java.util.Formatter;

public class Task_5_1 {
    public Task_5_1() {

Solve();
    }

    void Solve(){
        int N = 10;
double[][] Y_x = new double[N][2];

System.out.println(Y_x.length+"  "+Y_x[0].length);

        for(int i = 0; i < Y_x.length; i++){
            for(int j = 0; j < Y_x[0].length; j++){
                 Y_x[i][j] = 25 - 50*Math.random();
            }
        }

        ArrayList<Point> Segment_Array = new ArrayList<>();

for (int i = 0; i < Y_x.length; i++){
    for(int j = i; j < Y_x.length; j++) {
        if(i!=j) {
            Segment_Array.add(new Point(Y_x[i][0], Y_x[i][1], Y_x[j][0], Y_x[j][1]));
        }
    }
}
        Gnome_Sort(Segment_Array);

        Segment_Array.get(Segment_Array.size()-1).Show();
//Show_Matrix(Y_x);


    }

    double Segment(double X_1, double Y_1, double X_2, double Y_2){

        return Math.sqrt(Math.pow((X_1 - X_2), 2) + Math.pow((Y_1 - Y_2), 2));
    }
    void Show_Matrix(double[][] Array){
        Formatter form = new Formatter(System.out);
        for(int i = 0; i < Array.length; i++){
            for(int j = 0; j < Array[0].length; j++){
            form.format("%10.2f  ", Array[i][j]);
                //System.out.print(Array[i][j]+"  ");
            }
            form.format("\n");
        }
    }

    ArrayList Gnome_Sort(ArrayList<Point> ArrayList){
       int i = 1;
        while(i < ArrayList.size()){
            if(i==0 || ArrayList.get(i-1).getSegment() >= ArrayList.get(i).getSegment()){
                i++;
            }else{
                Point Temp = ArrayList.get(i-1);
                ArrayList.set(i-1, ArrayList.get(i));
                ArrayList.set(i,Temp);
                i--;
            }

        }

        return ArrayList;
    }
}
