package Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;

public class Task_1 {

  double Result;
  double X;  // point on number line
  double Err;      // accuracy
  double dif  = 10;
  Formatter format = new Formatter(System.out);
   public  Task_1(double X, double E){
        this.X = X;
        this.Err = E;

        Solve();

    }


    private void Solve(){
       int i = 0;

       int n = 1;
       double Sn = 1;
       double Result = 1;
       format.format("%-10s %10s %10s %10s\n", "Iterator", "Step", "Error", "Result");
       while(dif > Err){
           Sn*=X/n;
              Result = Result + Sn;
                dif = Math.abs((Result - Test_Function(X))/Test_Function(X));
           format.format("%-10s %10.2e %10.2e %10.2e\n", i,
                   new BigDecimal(Sn).setScale(16, RoundingMode.UP).doubleValue(),
                   new BigDecimal(dif).setScale(16, RoundingMode.UP).doubleValue(),
                   new BigDecimal(Result).setScale(16, RoundingMode.UP).doubleValue());
           n++;
           i++;
       }




//System.out.println(Result);

    }



  private double Test_Function(double x){
        return Math.exp(x);
    }
}
