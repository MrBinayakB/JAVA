import java.net.*;
import java.io.*;
import java.util.*;
class PalindromeClient{
    public static void main(String[] args){
        try{
            Scanner scan =new Scanner(System.in);
            Socket s=new Socket("localhost",4000);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            System.out.println("enter a string");
            String value=scan.next();
            dos.writeUTF(value);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            System.out.println(dis.readUTF());
            s.close();
            dis.close();
            dos.close();
            scan.close();
        }catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}