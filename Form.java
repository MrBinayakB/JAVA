import javax.swing.*;
class Form extends JFrame {
    public Form(){
        new JFrame("new form");
        setSize(400,500);
        
        JLabel l= new JLabel("Name:");
        l.setBounds(75,60,50,30);
        
        JTextField tf=new JTextField();
        tf.setBounds(120,60,100,30);

        JButton b=new JButton("Submit");
        b.setBounds(110,320,90,40);

        add(b); add(tf); add(l);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public static void main(String[]args){
        new Form();
    }  
}
