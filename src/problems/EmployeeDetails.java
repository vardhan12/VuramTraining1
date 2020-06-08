/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;
import java.io.*;
import java.util.*;
/**
 *
 * @author SURIYA_17
 */
public class EmployeeDetails {
    Scanner s=new Scanner(System.in);
    Boolean f=true;
    
        void op(){
             try{
                 FileOutputStream fo=new FileOutputStream("D:/EmployeeDetails.txt",true);
        
        ArrayList<String> emp=new ArrayList<String>();
        byte n[]=" Employee details\n".getBytes();
        fo.write(n);
                
        while(f){
        System.out.println("Enter your Details 1.No 2.Name 3.DOB 4.DOJ 5.Experience 6.Salary");
        for(int i=1;i<=6;i++)
        emp.add(s.nextLine());
        for(String e:emp){
            e=e+"\n";
            byte b[]=e.getBytes();
            fo.write(b);
            
        }
        
        System.out.println("1.continue 0.exit");
        int opt;
        opt=s.nextInt();
        if(opt==1)
            continue;
        else
            break;
        }
        fo.close();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
            
}
        void ip(){
            try{
            FileInputStream fi=new FileInputStream("D:/EmployeeDetails.txt");
            int i;
            if(fi.read()==-1){
                System.out.println("Empty file");
            }
            else{
            while((i=fi.read())!=-1){
                System.out.print((char)i);
            }
            }
            fi.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            
        }
    public static  void main(String args[]){
        
       EmployeeDetails ob=new EmployeeDetails();
       System.out.println("1.read 2.write");
        int opt;
        opt=ob.s.nextInt();
        if(opt==1)
            ob.ip();
        else
            ob.op();
    }
        
 }

