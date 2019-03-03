package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassEdu {

    public PathClassEdu() {
        Test();
    }

    void Test(){

        Path path;
String Adress = "C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\IO\\Лермонтов.txt";
        path = Paths.get(Adress);
System.out.println("Имя файла:              " + path.getFileName());
System.out.println("Номер папки в дириктории" + path.getNameCount());
System.out.println("Имя файловой системы    " + path.getFileSystem());
System.out.println("Адресс до файла         " + path.getParent());
System.out.println("Адресс файлового диска        " + path.getRoot());

        try {
           System.out.println( Files.size(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
