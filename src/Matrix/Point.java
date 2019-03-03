package Matrix;

import java.util.Comparator;
import java.util.Formatter;

public class Point  {
  private double X_1;
  private double Y_1;

  private double X_2;
  private double Y_2;

    public double getSegment() {
        return Segment;
    }

    private double Segment;

  Formatter f = new Formatter(System.out);

    public Point(double x_1, double y_1, double x_2, double y_2) {
        this.X_1 = x_1;
        this.Y_1 = y_1;
        this.X_2 = x_2;
        this.Y_2 = y_2;
        this.Segment=Segment();
    }

    double Segment(){

        return Math.sqrt(Math.pow((X_1 - X_2), 2) + Math.pow((Y_1 - Y_2), 2));
    }

    void Show(){

        f.format("%10.2f %10.2f %10.2f %10.2f %10.2f \n", X_1, Y_1, X_2, Y_2, Segment);

    }

    public boolean equals(Object obj){
        // Если объект равен сам себе, то выводим true
        if(obj == this){
            return true;
        }
        // Если объект пустой, то вывод false
        if(obj == null) {
            return false;
        }

        if(getClass()!= obj.getClass()){
            return false;
        }else{

            Point tmp = (Point) obj;

            if(tmp.getSegment()== this.getSegment()){

                return true;

            }else{

                return false;

            }
        }
    }

}
