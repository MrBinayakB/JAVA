import java.awt.event.*;
import javax.swing.*;
class Calc implements ActionListener{
    JTextField first,second,ans;
    JButton sum,sub;
    JFrame f;
    public Calc(){
        f=new JFrame("Simple Calculator");
        first=new JTextField();
        second=new JTextField();
        ans=new JTextField("Answer");
        sum=new JButton("+");
        sub=new JButton("-");

        f.setSize(400,550);
        first.setBounds(90,60,50,30);
        second.setBounds(210,60,50,30);
        ans.setBounds(140,190,55,30);
        sum.setBounds(90,300,50,30);
        sub.setBounds(210,300,50,30);
        f.add(first); f.add(second); f.add(ans); f.add(sum);f.add(sub);

        ans.setEditable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sum.addActionListener(this);
        sub.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(first.getText());
        int num2=Integer.parseInt(second.getText());
        if(e.getSource()==sum){
            int sum=num1+num2;
            ans.setText(""+sum);
        }else{
            int sub=num1-num2;
            ans.setText(""+sub);
        }
    }
    public static void main(String[]args){
        new Calc();
    }
}
