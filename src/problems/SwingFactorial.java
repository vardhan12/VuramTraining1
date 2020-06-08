/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SFact extends JFrame{
    JTextField t1,t2;
    JButton b;
            public SFact(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1=new JTextField("",10);
        t2=new JTextField("",10);
        b=new JButton("fact()");
        //anonymous class
        ActionListener al= new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b){
            int fact=1;
            int ans=Integer.parseInt(t1.getText());
            for(int i=1;i<=ans;i++){
                fact=fact*i;
                 }
            t2.setText(Integer.toString(fact));
            } 
    
        }
    };
        b.addActionListener(al);//using anonymous class
        add(t1);
        add(b);
        add(t2);
    }
    
}
public class SwingFactorial{
    public static void main(String[] args) {
        new SFact();
    }
}
