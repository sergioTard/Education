package Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;

public class Task_2 {
    double X;
    double Error;
Formatter format;
    public Task_2(double X, double error) {
       this.X = X;
       this.Error = error;
       Solve();
    }

    void Solve(){
format = new Formatter(System.out);
        double Sn = X;
        double Sum = X;
        int i = 2;
        format.format("%-10s %10s %10s %10s\n", "i", "Sn", "Error", "Sum");
            while(Error_Fucktion(Sum)>Error){
                Sn = -Sn*X*((3*i)-4)/(3*i);
                Sum+=Sn;
                format.format("%-10s %10.2e %10.2e %10.2e\n", i,
                        new BigDecimal(Sn).setScale(16, RoundingMode.UP).doubleValue(),
                        new BigDecimal(Error_Fucktion(Sum)).setScale(16, RoundingMode.UP).doubleValue(),
                        new BigDecimal(Sum).setScale(16, RoundingMode.UP).doubleValue());
                i++;
            }
System.out.println(Sum);
    }
    double Test(double X){
        return 3*Math.pow(1+X,0.333333) - 3;
    }
    double Error_Fucktion(double Result){
        return Math.abs((Result - Test(X))/Test(X));
    }
}
