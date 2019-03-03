package Task;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Task_11 {

    public Task_11(){
String Adress = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\Task\\";
String Name = "File_one.txt";
//WriteData_NIO(Adress, Name);
      //  WriteIO(Adress, Name);
        Read_IO(Adress, Name);
    }

    void WriteData_NIO(String Adress, String Name){
        ByteBuffer DBuf = null;
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        Path f = Paths.get(Adress+"//"+Name);

        try(FileChannel fc = (FileChannel) Files.newByteChannel(f, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            System.out.print(in.length());
           DBuf = ByteBuffer.allocate(in.length());

                   DBuf.put(in.getBytes("UTF-8"));

            DBuf.rewind();
            fc.write(DBuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DBuf.clear();
    }
    void WriteIO(String Adress, String Name){
        File f = new File(Adress+"//"+Name);
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        BufferedWriter rd = null;
        try {

            rd = new BufferedWriter(new FileWriter(f));
            rd.write(in);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    void Read_IO(String Adress, String Name){

        File f = new File(Adress+"//"+Name);

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(f));
            String Line;
            while((Line = br.readLine()) != null){
                System.out.println(Line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally{

            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    void Read_NIO(){

    }
}
