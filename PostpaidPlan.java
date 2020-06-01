/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import java.util.*;
/**
 *
 * @author SURIYA_17
 */
public class PostpaidPlan {
        int data=0;
    int cost=0;
    public int voicecall(int a){
       cost+=a;
       return cost;
    }
    public int videocall(int a){
       int bal= mobiledata(a*5);
        return bal;
        
        
    }
    public int mobiledata(int a){
        data+=a;
        return data;
    }
    public static void main(String[] args) {
        int min,dataa;
        
        
   
    }
}
