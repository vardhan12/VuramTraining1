
package problems;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class ArithmeticGui extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    TextField t1,t2,t3;
    public ArithmeticGui() throws HeadlessException{
        setLayout(new FlowLayout(FlowLayout.CENTER,5,50));
        setVisible(true);
        setSize(300,300);
        Label l=new Label("=");
        b1=new Button(" +  ");
        b1.addActionListener(this);
        b2=new Button(" - ");
        b2.addActionListener(this);
        b3=new Button(" * ");
        b3.addActionListener(this);
        b4=new Button(" / ");
        b4.addActionListener(this);
        
        t1=new TextField("",5);
        t2=new TextField("",5);
        t3=new TextField("",12);
        add(t1);
        add(t2);
        add(l);
        add(t3);
        
        
    }
    public void actionPerformed(ActionEvent e){
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
public class ArithmeticOpsAwt{
    public static void main(String[] args) {
     new ArithmeticGui();   
    }
}
