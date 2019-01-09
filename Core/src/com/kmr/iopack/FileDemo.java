package com.kmr.iopack;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File  f = new File("C:/Manohar/Learning/java.txt");
        File  f = new File("C:/Manohar/Learning");
        String fileList[] = f.list();
        int count = 0;
        for (String string : fileList) {
            count = count+1;
            System.out.println(string);    
        }
        System.out.println("Total List of files are: "+count);
        /*System.out.println(f.exists());
        f.createNewFile();
       System.out.println(f.exists()); */
    }

}
