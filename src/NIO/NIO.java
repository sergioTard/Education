package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIO {
   public NIO(){
    //   Write();
       Read2();
   }

void Write(){
    String file ="C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\NIO\\f2.txt";
       try(FileChannel fc = (FileChannel) Files.newByteChannel(Paths.get(file), StandardOpenOption.WRITE,StandardOpenOption.CREATE)){

           ByteBuffer buffer = ByteBuffer.allocate(40);

           for(int i = 0; i < buffer.capacity(); i++){
               buffer.put((byte) ('A'+i));
           }
                buffer.rewind();
           fc.write(buffer);
       }catch (IOException e){

       }


}
void Read(){
       //путь к файлу который хотим прочесть
       String f ="C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\NIO\\f2.txt";
       //открытие файла и передача пути к файлу
       Path file = Paths.get(f);

       //создание канала fc и переда ему адреса файла
        try(SeekableByteChannel fc = (FileChannel) Files.newByteChannel(file)){
//выделение памяти в канале
            ByteBuffer  buf = ByteBuffer.allocate(50);
int temp = 0;
            do {
                temp = fc.read(buf);

                if(temp != -1){
                    //подготовка буффера к чтению
                    buf.rewind();

                    for(int i = 0; i < temp; i++){
                        System.out.print((char)buf.get());
                    }
                }

            }while (temp!=-1);

        } catch (IOException e) {
            e.printStackTrace();
        }

}
void Read2(){
       /*
       * Чтение со сопоставлением буфера и
       * */
    String f ="C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\NIO\\f2.txt";
       Path file = Paths.get(f);

       try(FileChannel fc = (FileChannel) Files.newByteChannel(file)){

           long Size = fc.size();
           MappedByteBuffer buf = fc.map(FileChannel.MapMode.READ_ONLY, 0 , Size);

            for(int i = 0; i < Size; i++){
                System.out.print((char) buf.get());
            }
       } catch (IOException e) {
           e.printStackTrace();
       }
}

}
