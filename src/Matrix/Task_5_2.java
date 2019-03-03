package Matrix;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Task_5_2 {

    public Task_5_2() {
     //   SaveMatrix(GenerateMatrix(6,8));
        String f = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\Matrix\\Matrix.txt";
    //    ShowMatrix(ReadMatrix(f));
        int[][] Matrix = ReadMatrix(f);
      //  Task_5_3(Matrix);
      //  Task_5_4(Matrix);
      //  Task_5_5(Matrix);
        String f2 = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\Matrix\\Matrix_2.txt";
        int[][] Matrix_2 = ReadMatrix(f2);
        //Task_5_6(Matrix_2);
        //Task_5_7(Matrix, Matrix_2);

    }
    void Task_5_3(int[][] Matrix){
        int Sum_gl=0;     // сумма элементов главной диагонали
        int Sum_pb=0;     // сумма элементов побочной диагонали
        int Sum_el_gl=0;  // сумма элементов под главной диагональю
        int u = 1;
        if(Matrix.length == Matrix[0].length){

            for(int i = 0; i < Matrix.length; i++){
                for(int j = 0; j < Matrix[0].length; j++){
                    if(i == j){
                      Sum_gl = (Matrix[i][j] > 0) ? Sum_gl + Matrix[i][j] : Sum_gl+0;
                    }

                    if((i+j) == Matrix.length-1){
                        Sum_pb = (Matrix[i][j] > 0) ? Sum_pb + Matrix[i][j] : Sum_pb+0;
                    }

                    if((i+j) == Matrix.length-1){
                        Sum_pb = (Matrix[i][j] > 0) ? Sum_pb + Matrix[i][j] : Sum_pb+0;
                    }

                    if( i >= j){
                        Sum_el_gl+=Matrix[i][j];
                    }

                }
            }

            System.out.println("Сумма элементов главной диагонали: "+Sum_gl+"\n"+
                               "Сумма элементов побочной диагонали: "+ Sum_pb+"\n"+
                               "Сумма элементов под главной диагонали: "+ Sum_el_gl);

        }else{
            System.out.println("Матрица не квадратная");
        }

    }

    void Task_5_4(int[][] Matrix){
int povt = 0;
int SimStr = 0;
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length/2 ; j++){

                if(Matrix[i][j] == Matrix[i][Matrix[0].length - 1 - j]){
                    povt++;
                }

            }

            if(povt >= Matrix[0].length/2){
                SimStr++;
                povt = 0;
            }
        }
System.out.println(SimStr);

        System.out.println(Matrix[0].length/2);
    }

    void Task_5_5(int[][] Matrix){
        int sr = 0;
        int k = 0;
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 1; j < Matrix[0].length; j++){
                if(Matrix[i][j-1] <= Matrix[i][j]){
                    sr++;
                }
            }
            if(sr >= Matrix[0].length - 1){

                k++;
            }
            sr = 0;
        }
        System.out.println(k);
    }

    void Task_5_6(int[][] Matrix){

int Sum_under_main_diag = 0;
int Sum_above_main_diag = 0;

        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                if(j > i){
                    Sum_above_main_diag +=Matrix[i][j];
                    System.out.printf("%3s ",Matrix[i][j]);
                }else if( j < i ) {
                    Sum_under_main_diag +=Matrix[i][j];
                    System.out.printf("%3s ",Matrix[i][j]);
                }else{
                    System.out.printf("%3s ","");
                }
            }
            System.out.println();
        }
System.out.printf("Cумма чисел над главной диагональю %s \n",Sum_above_main_diag );
System.out.printf("Cумма чисел над главной диагональю %s \n",Sum_under_main_diag );
System.out.printf("Разница %s \n",Sum_under_main_diag - Sum_above_main_diag );
    }

    void Task_5_7(int[][] Matrix_1, int[][] Matrix_2){
int sovp = 0;
        for(int i = 0; i < Matrix_1.length; i++){
            for(int j = 0; j < Matrix_1[0].length; j++){
                if(Matrix_1[i][j] == Matrix_2[0][0]){
                    for(int i2 = 0; i2 < Matrix_2.length; i2++){
                        for(int j2 = 0; j2 < Matrix_2[0].length; j2++){
                            if(Matrix_1[i+i2][j+j2] == Matrix_2[i2][j2]){
                                sovp++;
                            }
                        }
                    }
                    if (sovp == Matrix_2.length*Matrix_2[0].length){
                        System.out.println("ghfhf");
                        break;
                    }

                }
                if (sovp == Matrix_2.length*Matrix_2[0].length){
                    System.out.println("ghfhf");
                    break;
                }

            }
            if (sovp == Matrix_2.length*Matrix_2[0].length){
                System.out.println("ghfhf");
                break;
            }
        }

    }
    int[][] GenerateMatrix(int m, int n){

        int[][] Matrix = new int[m][n];
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                Matrix[i][j] = 5 - (int)(10*Math.random());
            }

        }
        return Matrix;
    }

    void SaveMatrix(int[][] Array){
String file = "Matrix.txt";
        String f = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\Matrix\\Matrix.txt";
        BufferedWriter writer = null;

        try {
            String Line;
            writer = new BufferedWriter(new FileWriter(new File(f)));

            for(int i = 0; i < Array.length; i++){
                for(int j = 0; j < Array[0].length; j++){
                    String tmp = String.format("%3.2s ",Array[i][j]);
                   // writer.write(Integer.toString(Array[i][j])+"\t");
                    writer.write(tmp);

                }
                writer.write( "\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    int[][] ReadMatrix(String AdressMatrix){
        BufferedReader read = null;
        int[][] Matrix = null;
        List<String> srt = new ArrayList<>();
        try {
            read = new BufferedReader(new FileReader(new File(AdressMatrix)));
            int i = 0;
            String Line;
            while((Line = read.readLine()) != null){
                 srt.add(Line);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        int a = srt.get(0).split("\\s+|//s*").length;
        Matrix = new int[srt.size()][a-1];

        for(int i = 0; i < srt.size(); i++){
            String[] words = srt.get(i).split("\\s+|//s*");
                for(int j = 0; j < words.length-1; j++){
                    Matrix[i][j] = Integer.parseInt(words[j+1]);
                }
        }
       // String[] words = Line.split("\\s+|//s*");
        return Matrix;
    }

    void ShowMatrix(int[][] A){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

    }
}
