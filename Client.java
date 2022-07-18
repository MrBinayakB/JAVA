import java.net.*;
import java.io.*;
import java.util.*;

class Client{
    public static void main(String[]args){
        try{
            Socket s=new Socket("localhost",4000);
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a num");
            int num=scan.nextInt();

            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeInt(num);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            int ans=dis.readInt();
            System.out.println("Square is "+ans);
            dis.close();
            dos.close();
            scan.close();
            s.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }    
    }
}