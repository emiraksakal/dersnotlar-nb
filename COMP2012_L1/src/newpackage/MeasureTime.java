/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author elifd
 */
public class MeasureTime {
    
     public static void main(String[] args) throws IOException{
        // call main1 
//        main1();    
//        // call main2 
//        main2();
    }
    
     public static void main1() throws IOException {
        PrintWriter pw = new PrintWriter("SumtoN.txt");
//        sumtoN(1); // call one time to load method in the cache
     
        for (int n =16; n<=65536; n*=2){
            long startTime = System.currentTimeMillis();
//            sumtoN(n);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime-startTime);
            pw.printf("N:%5d       T:%5d \n", n,elapsedTime);
        }
        pw.close();
    }
    
       public static void sumtoN(int N){
        long sum =0; 
        for (int i = 1; i<=N;i++){
            sum+=i;
        }
    }
       
       public static void main2() throws IOException {
        PrintWriter pw = new PrintWriter("doubleLoopSum.txt");
        doubleLoopSum(1); // call one time to load method in the cache
     
        for (int n =16; n<=65536; n*=2){
            long startTime = System.currentTimeMillis();
            doubleLoopSum(n);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime-startTime);
            pw.printf("N:%5d       T:%5d \n", n,elapsedTime);
        }
        pw.close();
    }
        // sum numbers [1..N]*[1..N]
    public static long doubleLoopSum(int N){
        long sum = 0;
        for (int i = 0; i< N; i++)
            for (int j = 0; j <N; j++)
               // for (int k = 0; k <1; k++)
                sum +=i*j;
        return sum;
    }
       
       
       
       
     
     
     
     
     
     
    
}
