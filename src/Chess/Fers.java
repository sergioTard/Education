package Chess;

public class Fers {
    public Fers(){
        Solve();
    }

    void Solve(){
        int n = 9;
            int Chance = 0;

            int X1 = 4;
            int Y1 = 4;

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                  Chance += Test_Eat(i, j, X1, Y1);
                  System.out.printf("Ферзь №1 %s  %s  Ферзь №2 %s   %s    Результат %d\n", i, j, X1, Y1, Test_Eat(i, j, X1, Y1) );
            }
        }
System.out.println(Chance);
    }

    int Test_Eat(int X1, int Y1, int X2, int Y2){
        return (X1==X2 || Y1 == Y2 || Math.abs(X1-X2)== Math.abs(Y1-Y2)) ? 0 : 1;
    }
}
