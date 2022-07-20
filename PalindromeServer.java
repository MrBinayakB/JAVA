import java.net.*;
import java.io.*;

class PalindromeServer{
public static void main(String[] args){
try{
     ServerSocket ss=new ServerSocket(4000);
     System.out.println("Running at port 4000");
     Socket s=ss.accept();
     System.out.println("Client is connected");
     DataInputStream dis=new DataInputStream(s.getInputStream());
     String value=dis.readUTF();
     int len=value.length();
     System.out.println(len);
     String reversevalue="";
     for(int i=len-1;i>=0;i--) 
       {
         reversevalue=reversevalue+value.charAt(i);
    	}
      DataOutputStream dos=new DataOutputStream(s.getOutputStream());
      	if(reversevalue.equals(value)){
    	 dos.writeUTF("this is palindrome");
    	}
        else{
            dos.writeUTF("this is not palindrome");
        }
    dos.close();
    dis.close();
    ss.close();
    s.close();
   
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
}