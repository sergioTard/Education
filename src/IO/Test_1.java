package IO;

import java.io.*;
import java.util.ArrayList;


public class Test_1 {

    public Test_1() throws IOException {
        // BiteReads();

        // data();
        //  SaveData();
        //  ReadFile();
        String f = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\Лермонтов.txt";
        //ReadBuferFile(f);
        //SaveBufferData("C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\File_2.txt", "We are champions");
        //SaveDIS();
        //ReadDIS();
        //ReadRAF();
        WriteRAF();
    }

    void BiteReads() throws IOException {


            byte data[] = new byte[10];
            System.out.println("Enter your data");
            System.in.read(data);
            System.out.println("You sent a");

            for(byte e : data){
                System.out.print( (char) e);
            }


    }
    void data(){
String file = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\File_1.txt";
    File f = new File(file);
    FileInputStream FIS   = null;
    InputStreamReader ISR = null;
    try {
        FIS = new FileInputStream(f);
        ISR = new InputStreamReader(FIS, "UTF-8");

        int b = 0;

       while((b = ISR.read()) !=-1){
            System.out.print((char) b);
       }

    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        try {
            FIS.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        try {
            ISR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

    void ReadFile(){
        /**
         * Чтение файла непосредственно из файла без буффера
         * */
        String f = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\Лермонтов.txt";
        File file = new File(f);

        try {
            int b = 0;
            Reader r = new FileReader(file);
            while ((b = r.read())!=-1){
                System.out.print((char) b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    void SaveData(){
        String file = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\File_2.txt";
        FileWriter FW = null;
        FileOutputStream FOPS = null;
        try {
            String A = "Запишем в фаил всякую херню\n";
            FW = new FileWriter(new File(file), true);
            FOPS = new FileOutputStream(file);
            FOPS.write(A.getBytes());
            FW.write(" Новая ХРЕНЮШКА");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                FOPS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Buffer
     * */
    void SaveBufferData(String Adress, String Data){
        BufferedWriter writer = null;
        try {
            String Line;
             writer = new BufferedWriter(new FileWriter(new File(Adress)));
             writer.write(Data);

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
/**
 * DataInputStream
 * */
    void SaveDIS(){

        DataOutputStream DIS = null;

        try {
            DIS = new DataOutputStream( new FileOutputStream("C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\data.bin" ));

            DIS.writeInt(111);
            DIS.writeChar(111);
            DIS.writeUTF("fgdfg");
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

    }
    void ReadDIS(){

        try(DataInputStream DIS = new DataInputStream(new FileInputStream(new File("C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\data.bin")))) {

            int a = DIS.readInt();
            char b = DIS.readChar();
            String s = DIS.readUTF();
            System.out.println(a+"   "+b+"    "+s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
/**
 * RandomAcsesFile
 * */
    void ReadRAF(){
        String file = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\3.txt" ;
        try {
            RandomAccessFile RAF = new RandomAccessFile(file, "r");
            System.out.println(RAF.length());
          String Line;
            while((Line = RAF.readLine()) != null){
               System.out.println(Line);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    void WriteRAF(){
        String file ="C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\RAF.txt";
        try {
        RandomAccessFile RIF = new RandomAccessFile(file,"rw");
        double a = 5.25546;
        RIF.write("fhff".getBytes("UTF-8"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * Повторение пройденного
     * */
    void IORead(){

        String f = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\Лермонтов.txt";

    }



    public static void main(String[] args){
        String f = "C:\\test\\Optimization\\OptimizationWide\\Equipotential\\10V\\Sum=200.txt";
        Print(ReadBuferFile(f));
    }
    static String[][] ReadBuferFile(String f){

ArrayList<String> List= new ArrayList<>();
        File file = new File(f);
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(file));
            String Line;

            while(( Line = read.readLine())!= null){
                List.add(Line);
            }


        }catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }finally {
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

String[][] ArrayString = new String[2][List.size()];

        int i = 0;

        for(String e : List){
            String[] temp = e.split("\\s+|//s*");
            ArrayString[0][i]=temp[0];
            ArrayString[1][i]=temp[1];
            i++;
        }

        return ArrayString;
    }

    static void Print(String[][] arr){
        for (int i = 0; i < arr[0].length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println();
        }
    }
}
