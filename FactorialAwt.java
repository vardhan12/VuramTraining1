/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyGui extends Frame implements ActionListener{
    Button b;
    TextField t,t1;
    public MyGui() throws HeadlessException {
        setVisible(true);
        setSize(250,200);
        setLayout(new FlowLayout());
        Label l=new Label("Fact...");
        Label l2=new Label("Ans...");
        t=new TextField("",5);
       
        t1=new TextField("",5);
        b=new Button("Fact()");
        b.addActionListener(this);
        add(l);
        add(t);
        add(l2);
        add(t1);
        add(b);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            int fact=1;
            int ans=Integer.parseInt(t.getText());
            for(int i=1;i<=ans;i++){
                fact=fact*i;
            }
            t1.setText(Integer.toString(fact));
        } 
    }
}

public class FactorialAwt {
    public static void main(String[] args) {
        new MyGui();
    }
}
