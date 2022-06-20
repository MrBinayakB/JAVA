import javax.swing.*;
class Form extends JFrame {
    public Form(){
        new JFrame("new form");
        setSize(400,500);
        
        JLabel l= new JLabel("Name");
        l.setBounds(150,60,20,30);
        
        JTextField tf=new JTextField();
        tf.setBounds(90,60,100,30);

        JButton b=new JButton("Submit");
        b.setBounds(70,320,30,40);

        add(b); add(tf); add(l);
        setVisible(true);
        setLayout(null);
    }  
    public static void main(String[]args){
        new Form();
    }  
}
