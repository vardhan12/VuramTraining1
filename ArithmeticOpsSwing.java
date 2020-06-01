/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SwingGui extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5;
    
            
    public SwingGui(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("     arithmetic operation     ");
        l2=new JLabel("Result");
        t1=new JTextField("",10);
        t2=new JTextField("",10);
        t3=new JTextField("",10);
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("x");
        b4=new JButton("/");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(l1);
        add(t1);
        add(t2);
        add (l2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
   public void actionPerformed(ActionEvent e) {
       int n1,n2;
        if(e.getSource()==b1){
             n1=Integer.parseInt(t1.getText());
             n2=Integer.parseInt(t2.getText());
             t3.setText(Integer.toString(n1+n2));
             
        }
        else if(e.getSource()==b2){
            n1=Integer.parseInt(t1.getText());
             n2=Integer.parseInt(t2.getText());
             t3.setText(Integer.toString(n1-n2));

        }
        else if(e.getSource()==b3){
            n1=Integer.parseInt(t1.getText());
             n2=Integer.parseInt(t2.getText());
             t3.setText(Integer.toString(n1*n2));

        }
        else if(e.getSource()==b4){
            n1=Integer.parseInt(t1.getText());
             n2=Integer.parseInt(t2.getText());
             t3.setText(Integer.toString(n1/n2));

        }
       
   }
    
}
public class ArithmeticOpsSwing {
    public static  void main(String args[]){
        new SwingGui();
    }
}
