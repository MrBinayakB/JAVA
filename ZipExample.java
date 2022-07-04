import java.util.zip.*;
import java.io.*;
class ZipExample {
    public static void zip(File path) throws IOException{
        if(!path.isDirectory()){
            throw new IllegalArgumentException("This is not valid path");
        }
        File []files=path.listFiles();
        if(files.length==0){
            throw new IllegalArgumentException("File Empty");
        }
        FileOutputStream fos= new FileOutputStream("myzip.zip");
        ZipOutputStream zos=new ZipOutputStream(fos);
        
        for(File file:files){
            FileInputStream fis=new FileInputStream(file);
            ZipEntry ze=new ZipEntry(file.getName());
            ze.putNextEntry();
            int data;
            while((data=fis.read())!=-1){
                zos.write(data);
            }
            fis.close();
        }
        fos.close();
        zos.close();
    }
    public static void main(String[]args){
        zip("ogFolder");
    }
}
