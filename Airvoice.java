package problems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import mypack.*;
/**
 *
 * @author SURIYA_17
 */
public class Airvoice {
    public static void main(String args[]){
      
      Scanner s=new Scanner(System.in);
        System.out.println("Enter data and time");
        int dataa=s.nextInt();
        int min=s.nextInt();
        PrepaidPlan obj1=new PrepaidPlan();
        PostpaidPlan obj2=new PostpaidPlan();
        System.out.println("Prepaid plan");
        System.out.println("remaining  voice balance"+obj1.voicecall(min));
        System.out.println("remaining data balance"+obj1.videocall(dataa));
        System.out.println("Postpaid plan");
        System.out.println("  voice balance used"+obj2.voicecall(min));
        System.out.println("  data used"+obj2.videocall(dataa));
    }
}
