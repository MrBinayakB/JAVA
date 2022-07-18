import java.net.*;
import java.io.*;
import java.util.*;
class ChatServer {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Server Running at 5000");
            Socket s=ss.accept();
            System.out.println("Client Connected");
            DataInputStream dis;
            DataOutputStream dos;
            
            while(true){
                dis= new DataInputStream(s.getInputStream());
                String cMsg=(String)dis.readUTF();
                System.out.println("Client Says:"+cMsg);
                System.out.println("Enter your Reply");
                String reply=scan.nextLine();
                dos=new DataOutputStream(s.getOutputStream());
                dos.writeUTF(reply);
                dos.flush();
                
                if(cMsg.toLowerCase().equals("bye")){
                    break;
                }
            }
            scan.close();
            dos.close();
            dis.close();
            s.close();
            ss.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }    
}
