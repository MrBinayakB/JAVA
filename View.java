import javax.swing.*;
import java.awt.event.*;

class View extends JFrame {
    JTextField first,second,ans;
    JButton sum,sub;

    public void showUI(){
        setSize(400,600);

        first=new JTextField();
        second=new JTextField();
        ans=new JTextField();

        sum=new JButton("+");
        sub=new JButton("-");

        first.setBounds(50,50,70,40);
        second.setBounds(270,50,70,40);
        ans.setBounds(150,100,70,40);

        sum.setBounds(50,150,50,40);
        sub.setBounds(270,150,50,40);

        add(first); add(second); add(ans); add(sum); add(sub);
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ans.setEditable(false);

        Controller C=new Controller(this);
        sum.addActionListener(C);
        sub.addActionListener(C);
    } 
    public static void main(String[]args){
        View v=new View();
        v.showUI();
    }
    
}
class Controller implements ActionListener{
    View v;
    public Controller(View v){
        this.v=v;
    }
    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(this.v.first.getText());
        int num2=Integer.parseInt(this.v.second.getText());
        if(e.getSource()==this.v.sum){
            int sum=num1+num2;
            this.v.ans.setText(""+sum);
        }
        if(e.getSource()==this.v.sub){
            int sub=num1-num2;
            this.v.ans.setText(""+sub);
        }
    }
}