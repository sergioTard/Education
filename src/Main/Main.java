package Main;

import Chess.Fers;
import IO.*;
import Lamda.*;
import NIO.NIO;
import Task.*;
import Matrix.*;
import Test.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main {

   public static void main(String[] arg) throws IOException {

   // Task_1 T1 = new Task_1(-15,0.001);
   // Task_2 T2 = new Task_2(0.1,0.00001);
       /**
        * Целые числа
        * */
     // Task_3 T3 = new Task_3( 88593477);
     // Task_4 T4 = new Task_4(10946);
     // Task_5 T5 = new Task_5(676);
     // Task_6 T6 = new Task_6(5,0,0,3);
     // Task_7 T7 = new Task_7(157454,157454);
     // Task_9 T9 = new Task_9(51);
     // Task_10 T10 = new Task_10(123456);
     // Task_11 T11 = new Task_11();
/**
 * Одномерные массивы
 * */

//Task_4_1 T_4_1 = new Task_4_1();

    //Task_4_2 T_4_2 = new Task_4_2();
   // Task_4_All T_4_All = new Task_4_All();

/**
 * Глава 5:  Матрицы
 *  * */
//T0ask_5_1 T51 = new Task_5_1();
    //  Task_5_2 T51 = new Task_5_2();



/**
 *
 *Изучение ввода-вывода
 *
 * */

   //Test_1 a = new Test_1();
   //PathClassEdu PathClassEdu = new PathClassEdu();

     // NIO a = new NIO();



      /**
       * Lamda Expression
      */
/*
      Operation Lmd = new Operation() {
         @Override
         public double getResult(double a, double b) {
            return 0;
         }
      };
      Operation lamda = (a,b)->a+b;
      System.out.println(lamda.getResult(3.0,3.0));

      Factorial fact = n ->{
      int result = 1;
      for(int i = 1; i <= n; i++){
         result *=i;
      }
      return result;
      };
System.out.println(fact.factorial(5));
*/
 /*     Predicate<Integer> pr = (a)->a==0;
      System.out.println(pr.test(0));

      Consumer<String> str = (val)->{System.out.println(val);};
str.accept("jgj");*/
/*
 Consumer<String> cs = (str)->{System.out.println(str);};
 cs.accept("Hellow Lamda");
Consumer<String> sc = System.out::println;
sc.accept("jgjgj");*/
  /*    Database db = User::new;
      User user = db.create("SS","S");
      System.out.println(user.getPassword() + "   " + user.getUser());
*/

//System.out.println(getResults('+').getResult(15,15));
//StreamAPI a = new StreamAPI();
      //  F a = new F();
     // Comparable a1 = new Work(78);
     // ActionListener a = new AL();
     // Timer t = new Timer(100, a);
     // t.start();

      //Fers a = new Fers();


   }

   private static Operation getResults(char Symbol){
switch (Symbol){
   case '+': return (c, b)->c+b;
   case '-': return (c, b)->c-b;
   case '*': return (c, b)->c*b;
   default: return (c, b) -> 0;
}
   }
}
