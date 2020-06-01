/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;
import java.util.*;
/**
 *
 * @author SURIYA_17
 */
 class Hi implements Runnable{
    public void run(){
        //try{
        
        for(int i=0;i<5;i++){
        System.out.println("Hi");
        
        
    }
        
        /*catch(InterruptedException e){
            System.out.println("Error occured");
        }*/
    }
 }
class Hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("Hello");
    }
}
public class Insurance{
    public static void main(String[] args) {
        Hi ob1=new Hi();
        Hello ob2=new Hello();
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
       
        
    }
  
}
