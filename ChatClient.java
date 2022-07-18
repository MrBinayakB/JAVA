import java.net.*;
import java.io.*;
import java.util.*;
class ChatClient {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        try{
            Socket s=new Socket("localhost",5000);
            DataInputStream dis;
            DataOutputStream dos;
            while(true){
                System.out.println("Type a message for Server:");
                String msg=scan.nextLine();
                dos=new DataOutputStream(s.getOutputStream());
                dos.writeUTF(msg);
                dos.flush();

                dis=new DataInputStream(s.getInputStream());
                String Sreply=(String)dis.readUTF();
                System.out.println("Server says:"+Sreply);

                if(msg.toLowerCase().equals("bye")){
                    break;
                }
            }
            dis.close();
            dos.close();
            scan.close();
            s.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}