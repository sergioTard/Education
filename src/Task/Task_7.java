package Task;

import java.util.*;

public class Task_7 implements Task{
    int Num_1,Num_2;

    public Task_7(int num_1, int num_2) {
       this.Num_1 = num_1;
       this.Num_2 = num_2;
       Solve();
    }


    @Override
    public void Solve() {
        List<Integer> Multipliers_1 ;
        List<Integer> Multipliers_2 ;
      Multipliers_1 = GMylti(Num_1);
      Multipliers_2 = GMylti(Num_2);

        Set<Integer> Set_1 = new HashSet<>(Multipliers_1);
        Set_1.add(1);
        Set<Integer> Set_2 = new HashSet<>(Multipliers_2);
        Set_1.retainAll(Set_2);
        Iterator it = Set_1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }

        System.out.println("\n"+Set_1.size());
    }

    List<Integer> GMylti(int Num){

//System.out.println(Num);
        List<Integer> Multipliers= new ArrayList<>();
        if (Num == 1){Multipliers.add(1);
        return Multipliers;}

        int Multp = 2;
        while(Num>1){
            if (Num % Multp == 0) {
                Multipliers.add(Multp);
                //System.out.println(Num + "  " + Multp);
                Num = Num / Multp;
                Multp = 2;
            } else {
                Multp++;
            }

        }


        return Multipliers;
    }

    void Show_List(List<Integer> A){
        Iterator it = A.iterator();
        Formatter f = new Formatter(System.out);
        while(it.hasNext()){
            f.format("%-5s",it.next());
        }
        f.format("\n");
for (int i = 0; i < A.size(); i++){
    System.out.print(A.get(i)+"  ");
}
    }
}
