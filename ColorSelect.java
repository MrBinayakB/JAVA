import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class ColorSelect implements ActionListener{
    JFrame f;
    JButton red,blue,black;

    public ColorSelect(){
        f=new JFrame("Bg-Color");
        red=new JButton("Red");
        black=new JButton("Black");
        blue=new JButton("Blue");
        
        f.setSize(450,550);
        red.setBounds(180,50,100,35);
        black.setBounds(180,100,100,35);
        blue.setBounds(180,150,100,35);

        f.add(red); f.add(black); f.add(blue);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        red.addActionListener(this);
        black.addActionListener(this);
        blue.addActionListener(this);    
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==black){
            f.getContentPane().setBackground(Color.BLACK);
        }else if(e.getSource()==red){
            f.getContentPane().setBackground(Color.RED);
        }else{
            f.getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String[]args){
        new ColorSelect();
    }
}
