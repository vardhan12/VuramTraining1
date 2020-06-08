package problems;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SURIYA_17
 */
class InitialDepositException extends Exception{
    public InitialDepositException(String s){
        super(s);
    }
    }
public class exception3000{
    void deposit(int m)throws InitialDepositException{
        if(m<3000)
            throw new InitialDepositException("insufficient deposit");
        else
            System.out.println("Deposit successfull");
    }
    public static void main(String args[]){
        int amount;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter amount");
        amount=s1.nextInt();
        exception3000 ob= new exception3000();
        try{
        ob.deposit(amount);
    }
        catch(Exception e){
            System.out.println("Alert "+e);
        }
}
}

