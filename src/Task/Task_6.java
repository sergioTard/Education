package Task;

import java.util.Formatter;

public class Task_6 implements Task{
    private int X1, Y1, X2, Y2 ;
    private int X0 = 0, Y0 =0;

    public Task_6(int x1, int y1, int x2, int y2) {
        this.X1 = x1;
        this.Y1 = y1;
        this.X2 = x2;
        this.Y2 = y2;
        Solve();
    }


    @Override
    public void Solve() {
        int[] Edge = new int[3];
        Edge[0] = (int) Math.pow((X0-X1),2) + (int) Math.pow((Y0-Y1),2);
        Edge[1] = (int) Math.pow((X0-X2),2) + (int) Math.pow((Y0-Y2),2);
        Edge[2] = (int) Math.pow((X2-X1),2) + (int) Math.pow((Y2-Y1),2);

      /*  for(int i = 0; i<Edge.length-1; i++ ){
            int Temp = Edge[i];
            if(Edge[i]<Edge[i+1]){
                Edge[i]=Edge[i+1];
                Edge[i+1]=Temp;
            }
        }*/
      Sort(Edge);
   //   int[] A = {10,5,9,7,3,4,60,84,45,78};
   //   Sort(A);

    if(Edge[2]==Edge[1]+Edge[0]){
       System.out.println("Треугольник является прямоугольным");
    }else{

        System.out.println("Нихера!");

    }

    }

    void Sort(int[] Edge){
        int i = 1;
        while( i < Edge.length){


            if (i==0 ||Edge[i-1]<=Edge[i]){
                i++;
            }else{
                int Temp = Edge[i];
                Edge[i]=Edge[i-1];
                Edge[i-1]=Temp;
                i--;
            }

        }
        Show_Matrix(Edge);
    }
    void Show_Matrix(int[] A){
        Formatter f = new Formatter(System.out);
        for(int i = 0; i < A.length; i++) {
            f.format("%-10s  ",A[i]);
        }
        f.format("\n");
    }
}
