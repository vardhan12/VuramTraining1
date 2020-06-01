package mypack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class PrepaidPlan {
    int data=1000;
    int cost=100;
    public int voicecall(int a){
       cost-=a;
       return cost;
    }
    public int videocall(int a){
       int bal= mobiledata(a*5);
        return bal;
        
        
    }
    public int mobiledata(int a){
        data-=a;
        return data;
    }
    public static void main(String[] args) {
        int min,dataa;
        
        
   
    }   
}
