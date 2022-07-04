import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class MenuGUI extends MouseAdapter implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu menu;
    JMenuItem select,copy,cut,paste,exit,nw,open,rename;
    JTextArea t1,t2;
    JPopupMenu pm; 

    public MenuGUI(){
        f=new JFrame();
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        t1=new JTextArea("Enter Text");
        t1.setBounds(50,50,290,150);
        t1.setBackground(Color.YELLOW);
        f.add(t1);
        t2=new JTextArea();
        t2.setBounds(50,250,290,150);
        t2.setBackground(Color.CYAN);
        f.add(t2);

        mb=new JMenuBar();
        f.setJMenuBar(mb);

        menu=new JMenu("Menu"); //Creating Menu
        mb.add(menu);

        // Creating MenuItem and Adding them in Menu
        select=new JMenuItem("Select All");
        copy=new JMenuItem("Copy");
        cut=new JMenuItem("Cut");
        paste=new JMenuItem("Paste");
        exit=new JMenuItem("Exit");
        
        menu.add(select);
        menu.add(copy);
        menu.add(cut);
        menu.add(paste);
        menu.addSeparator();
        menu.add(exit);

        pm=new JPopupMenu(); //Creating Popup Menu

        // Creating MenuItem and adding on POP-UP Menu
        nw=new JMenuItem("New");
        open=new JMenuItem("Open");
        rename=new JMenuItem("Rename");
        pm.add(nw);
        pm.add(open);
        pm.add(rename);
        pm.addSeparator();
        pm.add(exit);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Event Handling
        select.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

        f.addMouseListener(this);
    }
    //overiding EventHandling Function
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
            System.exit(0);
        }
        else if(e.getSource()==select){
            t1.selectAll();
        }
        else if(e.getSource()==copy){
            t1.copy();
        }
        else if(e.getSource()==paste){
            t2.paste();
        }
        else if(e.getSource()==cut){
            t1.cut();
        }
    }
    public void mouseClicked(MouseEvent e){ //Event handling for Popup Menu
        pm.show(f,e.getX(),e.getY());
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
    public static void main(String[]args){
        new MenuGUI();
    }
}
