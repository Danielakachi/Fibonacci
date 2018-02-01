/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci_first.hundred;

/**
 *
 * @author Dell E6540
 */
public class Fibonacci_firstHundred {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=0; int b=1; int c;
       System.out.println("0"+"\n"+"1");
       do
       {
           c=a+b; 
           if(c>100) {break;}
           System.out.print(c+","); a=b; b=c;
           
       }while(c<100);
    }
    
 }

  
    

