import javax.swing.*;
import java.awt.event.*;

class MouseInOut extends JFrame implements MouseListener,MouseMotionListener{
    JTextField t1,t2;
    public MouseInOut(){
        setSize(400,600);
        t1=new JTextField();
        t1.setBounds(50,50,100,40);

        t2=new JTextField();
        t2.setBounds(50,180,100,40);
        add(t1); add(t2);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseEntered(MouseEvent e){
        t1.setText("In");
    }
    public void mouseExited(MouseEvent e){
        t1.setText("Out");
    }
    public void mouseMoved(MouseEvent e){
        String loc="X:"+e.getX()+" Y:"+e.getY();
        t2.setText(loc);
    }
    public void mouseDragged(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public static void main(String[]args){
        new MouseInOut();
    }
}