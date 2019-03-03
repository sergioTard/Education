package Task;

import java.util.ArrayList;
import java.util.List;

public class Task_5 implements Task {
    private int Number;

    public Task_5(int Number) {
        this.Number = Number;
        Solve();
    }

    @Override
    public void Solve() {
        int i = 0;
        List<Integer> Numeretical = new ArrayList<>();
        int Temp = Number;
        while (Temp!=0){
            Numeretical.add(Temp % 10);
            Temp = (int)(Temp/10);
           // System.out.println(Numeretical.get(i)+"    "+i);
            i++;
        }

        int Polindrom = 0;
for (int j = 0; j < i; j++){
    Polindrom += Numeretical.get(j)*((int) Math.pow(10,i-j-1));
}
System.out.println(Number+"   "+Polindrom);
if (Number == Polindrom){
    System.out.println("Это число полиндром");
}else {
    System.out.println("Это не полиндром");

}

    }
}
