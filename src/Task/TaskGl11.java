package Task;

import java.io.*;

public class TaskGl11 {

  public static void main(String[] arg){
    String Adress ="C:\\Users\\Сергей\\IdeaProjects\\Education\\src\\Task\\TextFile.txt";
    Task_11_1(Adress);
  }

  public static void Task_11_1(String AdressFile){

char[] Sogls = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
char[] Glas  = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
    BufferedReader br = null;
    String Line = null;
    String[] Sentence = null;
    String[] Word = null;
    try{
      br = new BufferedReader(new FileReader(AdressFile));


      while((Line = br.readLine())!= null){

        Sentence = Line.split("\\.");
        int i = 0;
            while( i < Sentence.length){
              Word = Sentence[i].split("\\ ");



                  for (int j = 0; j < Word.length; j++){
                    int sogl = 0;
                    int glasn = 0;

                      char[] temp = Word[j].toCharArray();

                        for(int k = 0; k < temp.length; k++){
                            for(int u = 0; u < Sogls.length; u++){

                              if(temp[k] == Sogls[u]) {
                               sogl++;
                               break;
                              }

                              if( u < Glas.length){
                                if(temp[k] == Glas[u]){
                                    glasn++;
                                  break;
                                }
                              }
                            }
                        }
                    if(sogl > glasn){
                      System.out.println(Word[i] + "  "+ "Согласных больше" );
                    }else{
                      System.out.println(Word[i] + "  "+ "Главсных больше" );
                    }

                  }

            }
      }

    }catch (IOException e){
      System.out.println("Ошибка");
    }


  }

}
