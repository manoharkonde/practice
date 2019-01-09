package com.kmr.java7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResource {
public static void main(String[] args) {
    //C:\Manohar\Learning\write.txt
    try(FileOutputStream fos = new FileOutputStream("C:/Manohar/Learning/write.txt"); InputStream input = new FileInputStream("C:/Manohar/Learning/write.txt")) {
        
        //writing into file
        //String msg = "Writing an String input into Write text file";
        String msg = null;
        byte byteArray[] = msg.getBytes();
        fos.write(byteArray);
        System.out.println("writing Successfully done.");
        
        //reading from file
        DataInputStream dis = new DataInputStream(input);
        int data = input.available();
        byte[] byteArray2 = new byte[data]; //    
        dis.read(byteArray2);    
        String str = new String(byteArray2); // passing byte array into String constructor  
        System.out.println("------------Data read from file--------------");
        System.out.println(str);
    }catch (Exception e) {
    }
}
}
